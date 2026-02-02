package com.studentrecord;

import java.util.Comparator;

public class SortByRank {
    public static void main(String[] args) {

        StudentData.getStudents().stream()
                .sorted(Comparator.comparing(Student::getRank))
                .map(Student::getFirstName)
                .forEach(System.out::println);
    }
}