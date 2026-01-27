package com.csvhandling;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.*;

public class JsonCsvConverter {

    // JSON → CSV
    public static void jsonToCsv(String jsonFile, String csvFile) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        List<Map<String, Object>> students =
                mapper.readValue(new File(jsonFile),
                        new TypeReference<List<Map<String, Object>>>() {});

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))) {

            // Write header
            Set<String> headers = students.get(0).keySet();
            writer.write(String.join(",", headers));
            writer.newLine();

            // Write rows
            for (Map<String, Object> student : students) {
                List<String> row = new ArrayList<>();
                for (String header : headers) {
                    row.add(student.get(header).toString());
                }
                writer.write(String.join(",", row));
                writer.newLine();
            }
        }
    }

    // CSV → JSON
    public static void csvToJson(String csvFile, String jsonFile) throws IOException {

        List<Map<String, String>> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            String[] headers = br.readLine().split(",");
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Map<String, String> row = new LinkedHashMap<>();

                for (int i = 0; i < headers.length; i++) {
                    row.put(headers[i], values[i]);
                }
                data.add(row);
            }
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File(jsonFile), data);
    }

    public static void main(String[] args) throws IOException {

        jsonToCsv("students.json", "students.csv");
        csvToJson("students.csv", "students_converted.json");

        System.out.println("JSON ↔ CSV conversion completed.");
    }
}
