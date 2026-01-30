package com.organization;

import java.util.Comparator;

public class HighestPaidEmployee {
	public static void main(String[] args) {
		Employee highestPaid = EmployeeData.getEmployees().stream()
		                .max(Comparator.comparing(Employee::getSalary))
		                .get();
		System.out.println(highestPaid);
	}
}
