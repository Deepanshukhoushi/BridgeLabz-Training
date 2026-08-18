package Day_12.OOPS_Practice.DeepCopy;

public class Student {

    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // shallow copy - both students share the same Address reference
    Student(Student other, boolean shallow) {
        this.name = other.name;
        this.address = other.address;
    }

    // deep copy - creates a new Address object
    Student(Student other) {
        this.name = other.name;
        this.address = new Address(other.address);
    }

    void display() {
        System.out.print("Name: " + name + " | Address -> ");
        address.display();
    }
}
