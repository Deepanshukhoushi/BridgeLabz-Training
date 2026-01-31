package com.organization;

import java.util.Comparator;

public class FirstFiveHighestPaid {
	public static void main(String[] args) {
		EmployeeData.getEmployees().stream().
        sorted(Comparator.comparing(Employee::getSalary).reversed())
        .limit(5)
        .forEach(System.out::println);
	}
}
