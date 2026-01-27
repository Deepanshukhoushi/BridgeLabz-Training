package com.annotationsandreflection.reflection.dependencyinjection;

public class Notification {

    @Inject
    private MessageService messageService;

    public void notifyUser() {
        messageService.sendMessage("Hello from DI Container!");
    }
}
