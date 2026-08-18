package Day_12.OOPS_Practice.EmployeeIDGenerator;

public class Employee {

    private static int counter = 1000;
    private int id;
    private String name;

    public Employee(String name) {
        counter++;
        this.id = counter;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name);
    }
}
