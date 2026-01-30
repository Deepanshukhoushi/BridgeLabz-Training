package com.organization;

import java.util.Map;
import java.util.stream.Collectors;

public class MaleFemaleCountSales {
	public static void main(String[] args) {
		Map<String, Long> salesGenderCount =
		        EmployeeData.getEmployees().stream()
		                .filter(e -> e.getDepartment().equals("Sales"))
		                .collect(Collectors.groupingBy(
		                        Employee::getGender,
		                        Collectors.counting()));
		System.out.println(salesGenderCount);
	}
}
