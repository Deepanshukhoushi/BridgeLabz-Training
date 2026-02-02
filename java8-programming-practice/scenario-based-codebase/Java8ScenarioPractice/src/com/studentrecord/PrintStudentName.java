package com.studentrecord;

public class PrintStudentName {
	public static void main(String[] args) {
		StudentData.getStudents()
        .stream()
        .map(s -> s.getFirstName())
        .forEach(name -> System.out.println(name));

	}
}
