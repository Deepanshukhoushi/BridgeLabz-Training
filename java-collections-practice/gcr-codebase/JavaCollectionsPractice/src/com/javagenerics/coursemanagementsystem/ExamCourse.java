package com.javagenerics.coursemanagementsystem;

class ExamCourse extends CourseType {
    @Override
    public String getEvaluationMethod() {
        return "Exam-Based Evaluation";
    }
}

class AssignmentCourse extends CourseType {
    @Override
    public String getEvaluationMethod() {
        return "Assignment-Based Evaluation";
    }
}

class ResearchCourse extends CourseType {
    @Override
    public String getEvaluationMethod() {
        return "Research-Based Evaluation";
    }
}
