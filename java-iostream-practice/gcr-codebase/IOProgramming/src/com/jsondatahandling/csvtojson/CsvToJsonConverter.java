package com.jsondatahandling.csvtojson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CsvToJsonConverter {
    public static void main(String[] args) {

	String csvFile = "samplefiles/csvtojson/data.csv";
	String jsonFile = "samplefiles/csvtojson/data.json";

	ObjectMapper mapper = new ObjectMapper();
	List<Map<String, String>> records = new ArrayList<>();

	try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {

	    String headerLine = reader.readLine();
	    String[] headers = headerLine.split(",");

	    String line;

	    while ((line = reader.readLine()) != null) {

		String[] values = line.split(",");

		Map<String, String> row = new LinkedHashMap<>();

		for (int i = 0; i < headers.length; i++) {
		    row.put(headers[i], values[i]);
		}

		records.add(row);
	    }

	    mapper.writerWithDefaultPrettyPrinter().writeValue(new File(jsonFile), records);
	    System.out.println("CSV converted to JSON successfully.");

	} catch (IOException e) {
	    System.out.println("Error reading CSV or writing JSON.");
	    System.out.println(e.getMessage());
	}
    }
}