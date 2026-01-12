package com.skillforge;

class Course {

    private String title;
    private Instructor instructor;
    private String[] modules;
    private double rating;
    private final String[] internalReviews; 

    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Introduction", "Basics", "Final Project"};
        this.internalReviews = new String[]{"Good", "Very Helpful"};
    }

    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.internalReviews = new String[]{"Excellent Content"};
    }

    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            rating = newRating;
        }
    }

    public String getTitle() {
        return title;
    }

    public int getTotalModules() {
        return modules.length;
    }

    public double getRating() {
        return rating;
    }

    public String[] getInternalReviews() {
        return internalReviews.clone();
    }
}

