package com.jsondatahandling.filterjsonbyage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class FilterUsersByAge {
    public static void main(String[] args) {

	String filePath = "samplefiles/filterjsonbyage/users.json";
	ObjectMapper mapper = new ObjectMapper();

	try {

	    List<User> users = mapper.readValue(new File(filePath), new TypeReference<List<User>>() {
	    });

	    System.out.println("Users older than 25:");

	    for (User user : users) {
		if (user.getAge() > 25) {
		    System.out.println("ID: " + user.getId() + ", Name: " + user.getName() + ", Age: " + user.getAge());
		}
	    }

	} catch (IOException e) {
	    System.out.println("Error reading JSON file.");
	    System.out.println(e.getMessage());
	}
    }
}