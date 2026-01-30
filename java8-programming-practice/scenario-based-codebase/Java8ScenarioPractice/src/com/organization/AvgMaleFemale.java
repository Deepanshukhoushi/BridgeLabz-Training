package com.organization;

import java.util.Map;
import java.util.stream.Collectors;

public class AvgMaleFemale {
	public static void main(String[] args) {
		Map<String, Double> avgAge = EmployeeData.getEmployees().stream()
		                .collect(Collectors.groupingBy(
		                        Employee::getGender,
		                        Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAge);
	}
}
