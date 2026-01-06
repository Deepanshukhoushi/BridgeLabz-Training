package com.petpal;
import java.util.Scanner;
public class PetPalApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pet pet = null;

        System.out.print("Enter pet name: ");
        String name = scanner.nextLine();

        System.out.println("Choose pet type:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                pet = new Dog(name);
                break;
            case 2:
                pet = new Cat(name);
                break;
            case 3:
                pet = new Bird(name);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        System.out.println("\nPet adopted successfully!");
        pet.makeSound();

        System.out.println("\nChoose action:");
        System.out.println("1. Feed");
        System.out.println("2. Play");
        System.out.println("3. Sleep");
        System.out.print("Enter action: ");
        int action = scanner.nextInt();

        switch (action) {
            case 1:
                pet.feed();
                break;
            case 2:
                pet.play();
                break;
            case 3:
                pet.sleep();
                break;
            default:
                System.out.println("Invalid action");
        }

        System.out.println("Current Mood: " + pet.getMood());
        scanner.close();
    }
}
