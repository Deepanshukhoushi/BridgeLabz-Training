package com.annotationsandreflection.annotations.customannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        TaskManager manager = new TaskManager();
        Method method = manager.getClass().getMethod("completeTask");

        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        System.out.println("Priority: " + taskInfo.priority());
        System.out.println("Assigned To: " + taskInfo.assignedTo());
    }
}
