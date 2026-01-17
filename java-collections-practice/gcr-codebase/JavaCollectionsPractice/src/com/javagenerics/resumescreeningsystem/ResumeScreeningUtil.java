package com.javagenerics.resumescreeningsystem;

class ResumeScreeningUtil {
    public static <T extends JobRole> boolean screenResume(
            Resume<T> resume) {

        return resume.getJobRole() instanceof SoftwareEngineer
                ? true
                : true;
    }
}
