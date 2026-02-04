package com.multithreading.threadstatemonitoring;

public class ThreadStateMonitoringSystem {
    public static void main(String[] args) {

        TaskRunner task1 = new TaskRunner("Task-1");
        TaskRunner task2 = new TaskRunner("Task-2");

        StateMonitor monitor = new StateMonitor(task1, task2);

        monitor.start();

        task1.start();
        task2.start();
    }
}
