package com.javagenerics.resumescreeningsystem;

class SoftwareEngineer extends JobRole {

    @Override
    public String getRoleName() {
        return "Software Engineer";
    }

    @Override
    public String getRequiredSkills() {
        return "Java, DSA, OOPs";
    }
}

class DataScientist extends JobRole {

    @Override
    public String getRoleName() {
        return "Data Scientist";
    }

    @Override
    public String getRequiredSkills() {
        return "Python, ML, Statistics";
    }
}

class ProductManager extends JobRole {

    @Override
    public String getRoleName() {
        return "Product Manager";
    }

    @Override
    public String getRequiredSkills() {
        return "Communication, Strategy, Leadership";
    }
}
