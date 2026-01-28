package com.jsondatahandling.validatejson;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONValidator {
    public static void main(String[] args) {

	String filePath = "samplefiles/validatejson/data.json";
	ObjectMapper mapper = new ObjectMapper();

	try {
	    mapper.readTree(new File(filePath));
	    System.out.println("JSON structure is valid");

	} catch (Exception e) {
	    System.out.println("Invalid JSON structure");
	    System.out.println(e.getStackTrace());
	}
    }
}