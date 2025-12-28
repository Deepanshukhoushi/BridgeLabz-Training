package com.constructor.level1;

public class CourseMain {

    public static void main(String[] args) {

        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Python Data Science", 5, 50000);

        // Before updating institute name
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name for all courses
        Course.updateInstituteName("XYZ Online Academy");

        // After updating institute name
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
