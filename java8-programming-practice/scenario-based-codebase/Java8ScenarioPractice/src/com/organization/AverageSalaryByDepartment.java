package com.organization;

import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryByDepartment {
	public static void main(String[] args) {
		Map<String, Double> avgSalaryByDept =
				EmployeeData.getEmployees().stream()
		                .collect(Collectors.groupingBy(
		                        Employee::getDepartment,
		                        Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalaryByDept);
	}
}
