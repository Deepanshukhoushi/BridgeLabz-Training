package com.organization;

import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeCountByDepartment {
	public static void main(String[] args) {
		Map<String, Long> empCountByDept = EmployeeData.getEmployees().stream()
		                .collect(Collectors.groupingBy(
		                        Employee::getDepartment,
		                        Collectors.counting()));
		System.out.println(empCountByDept);
	}
}
