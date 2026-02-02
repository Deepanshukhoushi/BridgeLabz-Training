package com.studentrecord;

public class RankLessThan50 {
	public static void main(String[] args) {
		StudentData.getStudents().stream().filter(e -> e.getRank() < 50)
		.forEach(System.out::println);
	}
}
