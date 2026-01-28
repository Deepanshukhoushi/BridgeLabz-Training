package com.jsondatahandling.filterjson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class FilterJsonByAge {
    public static void main(String[] args) {

	String filePath = "samplefiles/filterjson/people.json";

	ObjectMapper mapper = new ObjectMapper();
	try {

	    List<Person> people = mapper.readValue(new File(filePath), new TypeReference<List<Person>>() {
	    });


	    List<Person> filtered = new ArrayList<>();

	    for (Person p : people) {
		if (p.getAge() > 25) {
		    filtered.add(p);
		}
	    }

	    System.out.println("People with age > 25:");

	    for (Person p : filtered) {
		System.out.println("ID: " + p.getId() + ", Name: " + p.getName() + ", Age: " + p.getAge());
	    }

	} catch (IOException e) {
	    System.out.println("Error reading JSON file.");
	    System.out.println(e.getMessage());
	}
    }
}