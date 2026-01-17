package com.javagenerics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

class ScreeningPipeline {
    private final List<Resume<? extends JobRole>> resumes = new ArrayList<>();
    public void addResume(Resume<? extends JobRole> resume) {
        resumes.add(resume);
    }

    public void screenAllResumes() {
        if (resumes.isEmpty()) {
            System.out.println("No resumes to screen.");
            return;
        }

        for (Resume<? extends JobRole> resume : resumes) {
            boolean result = ResumeScreeningUtil.screenResume(resume);
            System.out.println(resume);
            System.out.println("Screening Result: "
                    + (result ? "Selected " : "Rejected "));
            System.out.println();
        }
    }
}
