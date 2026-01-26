package com.annotationsandreflection.annotations.maxlength;

import java.lang.reflect.Field;

class User {

    @MaxLength(10)
    private String username;

    public User(String username) {

        Field[] fields = this.getClass().getDeclaredFields();

        for (Field field : fields) {

            if (field.isAnnotationPresent(MaxLength.class)) {

                MaxLength maxLength = field.getAnnotation(MaxLength.class);

                if (field.getName().equals("username")) {

                    if (username.length() > maxLength.value()) {
                        throw new IllegalArgumentException(
                            "Username length must not exceed " + maxLength.value()
                        );
                    }
                }
            }
        }

        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
