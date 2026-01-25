package com.annotationsandreflection.annotations.todoannotation;

class ProjectService {

    @Todo(
        task = "Implement payment gateway",
        assignedTo = "Deepanshu",
        priority = "HIGH"
    )
    public void paymentModule() {
        
    }

    @Todo(
        task = "Add email notifications",
        assignedTo = "Rahul"
    )
    public void notificationModule() {
        
    }

    public void completedModule() {
        System.out.println("This module is completed");
    }
}
