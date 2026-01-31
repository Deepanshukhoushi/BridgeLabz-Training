package com.organization;

import java.util.Comparator;

public class FirstFiveLowestPaid {
	public static void main(String[] args) {
		EmployeeData.getEmployees().stream()
        .sorted(Comparator.comparing(Employee::getSalary))
        .limit(5)
        .forEach(System.out::println);

	}
}
