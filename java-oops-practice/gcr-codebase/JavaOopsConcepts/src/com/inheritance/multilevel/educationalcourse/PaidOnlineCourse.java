package com.inheritance.multilevel.educationalcourse;

public class PaidOnlineCourse extends OnlineCourse {

    private double fee;
    private double discount; // percentage

    public PaidOnlineCourse(String courseName, int duration,
                            String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Course Fee  : ₹" + fee);
        System.out.println("Discount   : " + discount + "%");
        System.out.println("Final Fee  : ₹" + calculateFinalFee());
    }

    private double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }
}
