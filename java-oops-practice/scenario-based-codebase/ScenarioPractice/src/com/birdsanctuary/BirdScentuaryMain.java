package com.birdsanctuary;
import java.util.Scanner;
public class BirdScentuaryMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SanctuaryService service = new SanctuaryService();

        while (true) {
            System.out.println("\nWelcome to Wings Bird Sanctuary");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Remove Bird by ID");
            System.out.println("4. Sanctuary Report");
            System.out.println("5. Show Developer Info");
            System.out.println("6. Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Choose Bird Type:");
                    System.out.println("1. Eagle 2. Duck 3. Penguin 4. Seagull 5. Kiwi");
                    int type = input.nextInt();

                    System.out.print("Enter ID: ");
                    String id = input.next();

                    System.out.print("Enter Name: ");
                    String name = input.next();

                    Bird bird = null;

                    switch (type) {
                        case 1: bird = new Eagle(id, name); break;
                        case 2: bird = new Duck(id, name); break;
                        case 3: bird = new Penguin(id, name); break;
                        case 4: bird = new Seagull(id, name); break;
                        case 5: bird = new Kiwi(id, name); break;
                    }

                    service.addBird(bird);
                    break;

                case 2:
                    service.displayAllBirds();
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    service.removeBirdById(input.next());
                    break;

                case 4:
                    service.report();
                    break;

                case 5:
                    service.showDeveloperInfo();
                    break;

                case 6:
                    System.out.println("Thank you for using Wings!");
                    System.exit(0);
            }  
        }
    }
}
