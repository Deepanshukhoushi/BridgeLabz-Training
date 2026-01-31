package com.organization;

import java.util.Comparator;

public class LowestPaidEmployee {
	public static void main(String[] args) {
		EmployeeData.getEmployees().stream()
        .min(Comparator.comparing(Employee::getSalary))
        .ifPresent(System.out::println);

	}
}
