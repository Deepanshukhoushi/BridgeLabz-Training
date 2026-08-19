package Day_13.Coding_Excercises;

class Parent {
    static void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    static void greet() {
        System.out.println("Hello from Child");
    }
}

public class StaticMethodHiding {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.greet(); // prints Parent's greet — static methods resolve by reference type, not object type
    }
}
