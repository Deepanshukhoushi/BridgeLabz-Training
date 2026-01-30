package com.methodreference.hospitalpatient;

import java.util.*;

public class PatientIDPrinting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> patientIds = new ArrayList<>();

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        System.out.println("Enter patient IDs:");
        for (int i = 0; i < n; i++) {
            patientIds.add(sc.nextInt());
        }

        System.out.println("\nPatient IDs for Admin Verification:");
        patientIds.forEach(System.out::println);
        
        sc.close();
    }
}
