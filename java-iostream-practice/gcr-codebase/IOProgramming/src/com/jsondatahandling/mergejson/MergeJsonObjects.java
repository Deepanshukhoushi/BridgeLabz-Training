package com.jsondatahandling.mergejson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

public class MergeJsonObjects {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            File file1 = new File("samplefiles/mergejson/user1.json");
            File file2 = new File("samplefiles/mergejson/user2.json");

            JsonNode node1 = mapper.readTree(file1);
            JsonNode node2 = mapper.readTree(file2);

            ObjectNode merged = mapper.createObjectNode();
 
            merged.setAll((ObjectNode) node1);
 
            merged.setAll((ObjectNode) node2);

            System.out.println("Merged JSON:");
            System.out.println(merged.toPrettyString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}