package Day_12.OOPS_Practice.DeepCopy;

public class DeepCopyMain {
    public static void main(String[] args) {

        Address addr = new Address("123 Main St", "Delhi", "110001");
        Student original = new Student("Alice", addr);

        System.out.println("--- Before any change ---");
        System.out.print("Original: "); original.display();

        Student shallowCopy = new Student(original, true);
        shallowCopy.address.city = "Mumbai";

        System.out.println("\n--- After changing shallowCopy city to Mumbai ---");
        System.out.print("Original:     "); original.display();
        System.out.print("Shallow Copy: "); shallowCopy.display();

        original.address.city = "Delhi";

        Student deepCopy = new Student(original);
        deepCopy.address.city = "Bangalore";

        System.out.println("\n--- After changing deepCopy city to Bangalore ---");
        System.out.print("Original:  "); original.display();
        System.out.print("Deep Copy: "); deepCopy.display();
    }
}
