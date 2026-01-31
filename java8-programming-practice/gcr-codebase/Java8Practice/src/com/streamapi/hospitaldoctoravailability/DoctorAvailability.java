package com.streamapi.hospitaldoctoravailability;

import java.util.*;

public class DoctorAvailability {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Asha", "Cardiology", true),
            new Doctor("Dr. Ravi", "Orthopedics", false),
            new Doctor("Dr. Meera", "Dermatology", true),
            new Doctor("Dr. John", "Neurology", true),
            new Doctor("Dr. Suresh", "Pediatrics", false)
        );

        System.out.println("Doctors Available on Weekends (Sorted by Specialty):");

        doctors.stream()
               // 🔹 filter weekend availability
               .filter(d -> d.availableOnWeekend)

               // 🔹 sort by specialty
               .sorted(Comparator.comparing(d -> d.specialty))

               // 🔹 print result
               .forEach(System.out::println);
    }
}
