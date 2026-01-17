package com.javagenerics.resumescreeningsystem;

class Resume<T extends JobRole> {

    private final String candidateName;
    private final int experience;
    private final T jobRole;

    public Resume(String candidateName, int experience, T jobRole) {
        this.candidateName = candidateName;
        this.experience = experience;
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    @Override
    public String toString() {
        return "Candidate: " + candidateName +
               " | Experience: " + experience + " years" +
               " | Role: " + jobRole.getRoleName() +
               " | Skills Needed: " + jobRole.getRequiredSkills();
    }
}
