package com.organization;

import java.util.Comparator;

public class ThirdHighestPaid {
	public static void main(String[] args) {
		EmployeeData.getEmployees().stream()
        .sorted(Comparator.comparing(Employee::getSalary).reversed())
        .skip(2)
        .findFirst()
        .ifPresent(System.out::println);

	}
}
