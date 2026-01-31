package com.streamapi.insuranceclaimanalysis;

import java.util.*;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
            new Claim("Health", 50000),
            new Claim("Vehicle", 20000),
            new Claim("Health", 70000),
            new Claim("Life", 150000),
            new Claim("Vehicle", 30000),
            new Claim("Life", 120000)
        );

        Map<String, Double> averageClaimAmount =
                claims.stream()
                      .collect(Collectors.groupingBy(
                          c -> c.claimType,
                          Collectors.averagingDouble(c -> c.amount)
                      ));

        System.out.println("Average Claim Amount by Type:");
        averageClaimAmount.forEach(
            (type, avg) -> System.out.println(type + " : " + avg)
        );
    }
}
