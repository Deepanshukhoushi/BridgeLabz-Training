package com.annotationsandreflection.reflection.customobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapperUtil {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {

        try {
            T obj = clazz.getDeclaredConstructor().newInstance();
            
            for (Field field : clazz.getDeclaredFields()) {

                field.setAccessible(true);

                if (properties.containsKey(field.getName())) {

                    Object value = properties.get(field.getName());

                    field.set(obj, value);
                }
            }
            return obj;

        } catch (Exception e) {
            throw new RuntimeException("Object mapping failed", e);
        }
    }
}
