package Day_12.OOPS_Practice.EmployeeIDGenerator;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee e1 = new Employee("Alice");
        Employee e2 = new Employee("Bob");
        Employee e3 = new Employee("Charlie");
        Employee e4 = new Employee("Diana");

        e1.display();
        e2.display();
        e3.display();
        e4.display();

        // e1.id = 9999; // COMPILE ERROR - private
    }
}
