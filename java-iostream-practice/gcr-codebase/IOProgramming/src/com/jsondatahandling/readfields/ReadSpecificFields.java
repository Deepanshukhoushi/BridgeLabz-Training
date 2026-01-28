package com.jsondatahandling.readfields;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadSpecificFields {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            File file = new File("samplefiles/readfields/user.json");

            JsonNode rootNode = mapper.readTree(file);

            String name = rootNode.get("name").asText();
            String email = rootNode.get("email").asText();

            System.out.println("User Name: " + name);
            System.out.println("User Email: " + email);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}