package com.studentrecord;

public class AgeGreaterThan25 {
	public static void main(String[] args) {
		StudentData.getStudents().stream().filter(e -> e.getAge()>25).forEach(System.out::println);
	}
}
