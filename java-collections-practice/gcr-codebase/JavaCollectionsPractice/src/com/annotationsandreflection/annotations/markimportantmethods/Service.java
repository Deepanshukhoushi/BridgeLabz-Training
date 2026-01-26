package com.annotationsandreflection.annotations.markimportantmethods;

class Service {

    @ImportantMethod   
    public void processOrder() {
        System.out.println("Processing order...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void generateReport() {
        System.out.println("Generating report...");
    }

    public void helperMethod() {
        System.out.println("Helper method (not important)");
    }
}
