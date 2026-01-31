package com.organization;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

public class AverageAndTotalSalary {
	public static void main(String[] args) {
		DoubleSummaryStatistics salaryStats =
		        EmployeeData.getEmployees().stream()
		                .collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println(salaryStats);
		
	}
}