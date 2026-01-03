package com.linkedlist.singly.studentrecordmanagement;

class StudentLinkedList {

    private StudentNode head;

    // Add at beginning
    public void addAtBeginning(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
        System.out.println("Student added at beginning.");
    }

    // Add at end
    public void addAtEnd(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Student added at end.");
    }

    // Add at specific position
    public void addAtPosition(int position, int roll, String name, int age, char grade) {
        if (position <= 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Student added at position " + position);
    }

    // Delete by roll number
    public void deleteByRoll(int roll) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.rollNumber == roll) {
            head = head.next;
            System.out.println("Student deleted.");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != roll) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found!");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted.");
        }
    }

    // Search by roll number
    public void searchByRoll(int roll) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNumber == roll) {
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }

    // Update grade
    public void updateGrade(int roll, char newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }

    // Display all students
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records found.");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            displayStudent(temp);
            temp = temp.next;
        }
    }

    private void displayStudent(StudentNode s) {
        System.out.println("------------------------");
        System.out.println("Roll No : " + s.rollNumber);
        System.out.println("Name    : " + s.name);
        System.out.println("Age     : " + s.age);
        System.out.println("Grade   : " + s.grade);
    }
}