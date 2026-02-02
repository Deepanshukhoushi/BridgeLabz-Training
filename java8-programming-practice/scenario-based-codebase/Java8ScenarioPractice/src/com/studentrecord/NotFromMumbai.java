package com.studentrecord;

public class NotFromMumbai {
	public static void main(String[] args) {
		StudentData.getStudents().stream().filter(e -> e.getCity() != "Mumbai").forEach(System.out::println);
	}
}
