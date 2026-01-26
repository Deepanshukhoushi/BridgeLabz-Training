package com.annotationsandreflection.annotations.customcatchingsystem;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class CacheExecutor {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object execute(Object target, String methodName, Object... args)
            throws Exception {

        Class<?> clazz = target.getClass();

        for (Method method : clazz.getDeclaredMethods()) {

            if (method.getName().equals(methodName)
                    && method.isAnnotationPresent(CacheResult.class)) {

                String cacheKey = methodName + "_" + args[0];

                if (cache.containsKey(cacheKey)) {
                    System.out.println("Returning cached result...");
                    return cache.get(cacheKey);
                }

                Object result = method.invoke(target, args);
                cache.put(cacheKey, result);
                return result;
            }
        }
        throw new NoSuchMethodException("Method not found");
    }
}
