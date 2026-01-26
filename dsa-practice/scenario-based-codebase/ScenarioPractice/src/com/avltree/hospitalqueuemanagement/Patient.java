package com.avltree.hospitalqueuemanagement;

import java.time.LocalTime;

public class Patient {
    LocalTime arrivalTime;
    String name;
    String problem;

    public Patient(LocalTime arrivalTime, String name, String problem) {
        this.arrivalTime = arrivalTime;
        this.name = name;
        this.problem = problem;
    }
}
