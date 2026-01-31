package com.collectors.studentresultgrouping;

import java.util.*;
import java.util.stream.Collectors;

public class StudentResultGrouping {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Rahul", "A"),
            new Student("Anita", "B"),
            new Student("Suresh", "A"),
            new Student("Meena", "C"),
            new Student("Kiran", "B")
        );

        Map<String, List<String>> studentsByGrade =
                students.stream()
                        .collect(Collectors.groupingBy(
                            s -> s.grade,
                            Collectors.mapping(s -> s.name,
                                               Collectors.toList())
                        ));

        System.out.println("Students Grouped by Grade:");
        studentsByGrade.forEach(
            (grade, names) -> System.out.println(grade + " : " + names)
        );
    }
}
