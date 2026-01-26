package com.annotationsandreflection.annotations.loggingexecution;

class PerformanceService {

    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1_000_000; i++) {
        	
        }
    }

    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 50_000_000; i++) {

        }
    }
}
