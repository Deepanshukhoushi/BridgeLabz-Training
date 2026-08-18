package Day_13.Coding_Excercises;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    String getSalary() {
        return name + " " + salary;
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    String getSalary() {
        return name + " " + salary + " " + teamSize;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee("Deepanshu", 423332);
        System.out.println(e.getSalary());

        e = new Manager("Deepanshu", 423332, 50);
        System.out.println(e.getSalary());
    }
}
