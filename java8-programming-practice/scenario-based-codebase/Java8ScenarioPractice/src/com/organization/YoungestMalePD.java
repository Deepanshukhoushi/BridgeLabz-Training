package com.organization;

import java.util.Comparator;

public class YoungestMalePD {
	public static void main(String[] args) {
		Employee youngestMalePD =
		        EmployeeData.getEmployees().stream()
		                .filter(e -> e.getGender().equals("Male"))
		                .filter(e -> e.getDepartment().equals("Product Development"))
		                .min(Comparator.comparing(Employee::getAge))
		                .get();
		System.out.println(youngestMalePD);
	}
}
