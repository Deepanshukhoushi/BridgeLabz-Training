package com.skillforge;

class Student extends User {

    private int progress; 
    private int marks;

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
        this.marks = 0;
    }

    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules; 
    }

    public void assignMarks(int marks) {
        this.marks = marks;
    }

    public int getProgress() {
        return progress;
    }

    public int getMarks() {
        return marks;
    }
}
