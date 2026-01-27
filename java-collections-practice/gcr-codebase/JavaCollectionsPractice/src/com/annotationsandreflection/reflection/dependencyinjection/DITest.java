package com.annotationsandreflection.reflection.dependencyinjection;

public class DITest {
    public static void main(String[] args) {
        Notification notification =
                SimpleDIContainer.getBean(Notification.class);

        notification.notifyUser();
    }
}
