package com.organization;

import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryByGender {
	public static void main(String[] args) {
		Map<String, Double> avgSalaryGender =
		        EmployeeData.getEmployees().stream()
		                .collect(Collectors.groupingBy(
		                        Employee::getGender,
		                        Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalaryGender);
	}
}
