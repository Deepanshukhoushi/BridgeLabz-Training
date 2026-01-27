package com.annotationsandreflection.reflection.dependencyinjection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class SimpleDIContainer {

    private static final Map<Class<?>, Object> container = new HashMap<>();

    public static <T> T getBean(Class<T> clazz) {

        try {
            if (!container.containsKey(clazz)) {
                T instance = clazz.getDeclaredConstructor().newInstance();
                container.put(clazz, instance);

                injectDependencies(instance);
            }

            return clazz.cast(container.get(clazz));

        } catch (Exception e) {
            throw new RuntimeException("Failed to create bean: " + clazz.getName(), e);
        }
    }

    private static void injectDependencies(Object obj) throws Exception {

        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {

            if (field.isAnnotationPresent(Inject.class)) {

                field.setAccessible(true);

                Object dependency = getBean(field.getType());

                field.set(obj, dependency);
            }
        }
    }
}
