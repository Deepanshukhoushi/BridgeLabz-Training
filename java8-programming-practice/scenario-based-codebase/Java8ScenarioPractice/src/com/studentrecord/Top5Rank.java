package com.studentrecord;

import java.util.Comparator;

public class Top5Rank {
    public static void main(String[] args) {

        StudentData.getStudents().stream()
                .sorted(Comparator.comparing(Student::getRank))
                .limit(5)
                .forEach(System.out::println);
    }
}
