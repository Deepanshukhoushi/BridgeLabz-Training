package com.organization;

import java.util.Comparator;

public class SecondLowestPaid {
	public static void main(String[] args) {
		EmployeeData.getEmployees().stream()
        .sorted(Comparator.comparing(Employee::getSalary))
        .skip(1)
        .findFirst()
        .ifPresent(System.out::println);

	}
}
