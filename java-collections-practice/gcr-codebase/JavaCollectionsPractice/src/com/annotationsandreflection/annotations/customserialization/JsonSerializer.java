package com.annotationsandreflection.annotations.customserialization;

import java.lang.reflect.Field;

class JsonSerializer {

    public static String toJson(Object object) {
        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = object.getClass().getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {

            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);

                JsonField annotation = field.getAnnotation(JsonField.class);
                String jsonKey = annotation.name();

                try {
                    Object value = field.get(object);

                    if (!firstField) {
                        json.append(", ");
                    }

                    json.append("\"").append(jsonKey).append("\": ");

                    if (value instanceof String) {
                        json.append("\"").append(value).append("\"");
                    } else {
                        json.append(value);
                    }

                    firstField = false;

                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        json.append("}");
        return json.toString();
    }
}
