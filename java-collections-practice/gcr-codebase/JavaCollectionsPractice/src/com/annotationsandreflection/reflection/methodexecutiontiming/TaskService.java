package com.annotationsandreflection.reflection.methodexecutiontiming;

public class TaskService {

    public void fastTask() {
        for (int i = 0; i < 1_000_000; i++);
    }

    public void slowTask() {
        for (int i = 0; i < 100_000_000; i++);
    }
}
