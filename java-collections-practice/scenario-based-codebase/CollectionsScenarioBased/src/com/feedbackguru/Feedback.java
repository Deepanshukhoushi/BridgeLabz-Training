package com.feedbackguru;
//import java.util.*;

public class Feedback<T> {
    private T type;
    private String message;

    public Feedback(T type, String message) {
        this.type = type;
        this.message = message;
    }

    public T getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
