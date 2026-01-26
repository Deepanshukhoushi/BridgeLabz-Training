package com.avltree.hospitalqueuemanagement;

import java.time.LocalTime;

public class HospitalAVLTree {
    private AVLNode root;

    private int height(AVLNode n) {
        return (n == null) ? 0 : n.height;
    }

    private int getBalance(AVLNode n) {
        return (n == null) ? 0 : height(n.left) - height(n.right);
    }

    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public void insert(Patient patient) {
        root = insertRec(root, patient);
    }

    private AVLNode insertRec(AVLNode node, Patient patient) {
        if (node == null) return new AVLNode(patient);

        if (patient.arrivalTime.isBefore(node.patient.arrivalTime))
            node.left = insertRec(node.left, patient);
        else
            node.right = insertRec(node.right, patient);

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        if (balance > 1 &&
            patient.arrivalTime.isBefore(node.left.patient.arrivalTime))
            return rightRotate(node);

        if (balance < -1 &&
            patient.arrivalTime.isAfter(node.right.patient.arrivalTime))
            return leftRotate(node);

        if (balance > 1 &&
            patient.arrivalTime.isAfter(node.left.patient.arrivalTime)) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 &&
            patient.arrivalTime.isBefore(node.right.patient.arrivalTime)) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void delete(LocalTime time) {
        root = deleteRec(root, time);
    }

    private AVLNode deleteRec(AVLNode root, LocalTime time) {
        if (root == null) return null;

        if (time.isBefore(root.patient.arrivalTime))
            root.left = deleteRec(root.left, time);
        else if (time.isAfter(root.patient.arrivalTime))
            root.right = deleteRec(root.right, time);
        else {
            if (root.left == null || root.right == null) {
                root = (root.left != null) ? root.left : root.right;
            } else {
                AVLNode temp = minValueNode(root.right);
                root.patient = temp.patient;
                root.right = deleteRec(root.right, temp.patient.arrivalTime);
            }
        }

        if (root == null) return null;

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    private AVLNode minValueNode(AVLNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    public void displayQueue() {
        System.out.println("Patients (Sorted by Arrival Time):");
        inorder(root);
    }

    private void inorder(AVLNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(
                "Time: " + node.patient.arrivalTime +
                " | Name: " + node.patient.name +
                " | Issue: " + node.patient.problem
            );
            inorder(node.right);
        }
    }
}
