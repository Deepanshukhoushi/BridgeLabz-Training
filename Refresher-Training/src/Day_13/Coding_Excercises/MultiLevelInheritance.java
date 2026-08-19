package Day_13.Coding_Excercises;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String course;

    Student(String name, String course) {
        super(name);
        this.course = course;
    }
}

class GraduateStudent extends Student {
    String thesisTitle;

    GraduateStudent(String name, String course, String thesisTitle) {
        super(name, course);
        this.thesisTitle = thesisTitle;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Thesis: " + thesisTitle);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent("Alice", "Computer Science", "AI in Healthcare");
        gs.display();
    }
}
