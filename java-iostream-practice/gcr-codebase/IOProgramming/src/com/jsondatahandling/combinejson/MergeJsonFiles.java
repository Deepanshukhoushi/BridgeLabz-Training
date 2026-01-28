package com.jsondatahandling.combinejson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class MergeJsonFiles {
    public static void main(String[] args) {
	String file1 = "samplefiles/combinejson/data1.json";
	String file2 = "samplefiles/combinejson/data2.json";

	ObjectMapper mapper = new ObjectMapper();

	try {

	    JsonNode json1 = mapper.readTree(new File(file1));
	    JsonNode json2 = mapper.readTree(new File(file2));

	    ObjectNode mergedJson = mapper.createObjectNode();

	    mergeNodes(mergedJson, json1);

	    mergeNodes(mergedJson, json2);

	    System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedJson));

	} catch (IOException e) {
	    System.out.println("Error reading JSON files.");
	}
    }

    private static void mergeNodes(ObjectNode target, JsonNode source) {

	for (Map.Entry<String, JsonNode> entry : source.properties()) {

	    target.set(entry.getKey(), entry.getValue());
	}
    }
}