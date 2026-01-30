package com.organization;

import java.util.Map;
import java.util.stream.Collectors;

public class MaleFemaleCount {

    public static void main(String[] args) {

        Map<String, Long> countByGender =
                EmployeeData.getEmployees().stream()
                        .collect(Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.counting()
                        ));

        System.out.println(countByGender);
    }
}
