package com.annotationsandreflection.reflection.customobjectmapper;

import java.util.HashMap;
import java.util.Map;

public class MapperTest {
    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("id", 101);
        data.put("name", "Ravi");
        data.put("email", "ravi@gmail.com");

        User user = ObjectMapperUtil.toObject(User.class, data);
        user.display();
    }
}
