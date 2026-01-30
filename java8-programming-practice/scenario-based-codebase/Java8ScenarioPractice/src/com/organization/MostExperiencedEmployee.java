package com.organization;

import java.util.Comparator;

public class MostExperiencedEmployee {
	public static void main(String[] args) {
		Employee mostExperienced =
		        EmployeeData.getEmployees().stream()
		                .min(Comparator.comparing(Employee::getYearOfJoining))
		                .get();
		System.out.println(mostExperienced);
	}
}
