package com.examresultuploader;

public class ExamRecord<T> {

    private String rollNo;
    private String name;
    private String subject;
    private T marks;

    public ExamRecord(String rollNo, String name, String subject, T marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public T getMarks() {
        return marks;
    }
}
