package com.jdbc.crudapplication;

public class Employee {

    private int id;
    private String name;
    private String email;
    private Integer age;        // Integer because it can be NULL
    private Integer salary;     // Integer because it can be NULL
    private String department;

    public Employee() {
    }

    public Employee(String name, String email, Integer age,
                    Integer salary, String department) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public Employee(int id, String name, String email,
                    Integer age, Integer salary, String department) {
        this(name, email, age, salary, department);
        this.id = id;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public Integer getSalary() { return salary; }
    public void setSalary(Integer salary) { this.salary = salary; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
