package com.annotationsandreflection.annotations.repeatableannotation;

class SoftwareFix {

    @BugReport(description = "NullPointerException occurs")
    @BugReport(description = "Incorrect output for edge case")
    public void process() {
        System.out.println("Processing task...");
    }
}
