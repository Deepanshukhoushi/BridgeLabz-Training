package com.geomeasure;
public class LineService {

    private static final double EPSILON = 0.0001;

    public void compareLines(Line line1, Line line2) {

        double length1 = line1.getLength();
        double length2 = line2.getLength();

        if (Math.abs(length1 - length2) < EPSILON) {
            System.out.println("Both lines are equal in length.");
        } else if (length1 > length2) {
            System.out.println("Line 1 is longer.");
        } else {
            System.out.println("Line 2 is longer.");
        }
    }
}
