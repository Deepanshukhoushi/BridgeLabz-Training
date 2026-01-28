package com.jsondatahandling.printkeysvalues;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class PrintJsonKeysAndValues {
    public static void main(String[] args) {
	String filePath = "samplefiles/printkeysvalues/data.json";

	ObjectMapper mapper = new ObjectMapper();
	try {
	    JsonNode rootNode = mapper.readTree(new File(filePath));

	    printNode(rootNode);

	} catch (IOException e) {
	    System.out.println("Error reading JSON file.");
	}
    }

    private static void printNode(JsonNode node) {
	if (node.isObject()) {

	    for (Map.Entry<String, JsonNode> entry : node.properties()) {
		System.out.println(entry.getKey() + " -> " + entry.getValue());
		printNode(entry.getValue());
	    }

	}

	if (node.isArray()) {
	    for (JsonNode element : node) {
		printNode(element);
	    }
	}
    }
}