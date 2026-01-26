package com.avltree.hospitalqueuemanagement;

public class AVLNode {
    Patient patient;
    AVLNode left, right;
    int height;

    public AVLNode(Patient patient) {
        this.patient = patient;
        this.height = 1;
    }
}
