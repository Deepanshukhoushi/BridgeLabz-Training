package com.annotationsandreflection.annotations.customannotation;

class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Deepanshu")
    public void completeTask() {
        System.out.println("Task completed");
    }
}

