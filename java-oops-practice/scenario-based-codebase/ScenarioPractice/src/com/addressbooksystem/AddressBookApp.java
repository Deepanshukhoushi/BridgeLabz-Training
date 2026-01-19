package com.addressbooksystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class AddressBookApp {
    private static ArrayList<Contact> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n Address Book Menu");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City or State");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 -> addContact();
                case 2 -> editContact();
                case 3 -> deleteContact();
                case 4 -> searchByCityOrState();
                case 5 -> displayAllContacts();
                case 6 -> {
                    System.out.println(" Exiting Address Book");
                    return;
                }
                default -> System.out.println(" Invalid choice");
            }
        }
    }

    private static void addContact() {

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println(" Contact already exists.");
                return;
            }
        }

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("State: ");
        String state = scanner.nextLine();

        System.out.print("Zip: ");
        String zip = scanner.nextLine();

        Address address = new Address(city, state, zip);
        contacts.add(new Contact(firstName, lastName, phone, email, address));

        System.out.println(" Contact added successfully.");
    }

    private static void editContact() {

        System.out.print("Enter First Name to edit: ");
        String name = scanner.nextLine();

        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(name)) {

                System.out.print("New Phone: ");
                String phone = scanner.nextLine();

                System.out.print("New Email: ");
                String email = scanner.nextLine();

                System.out.print("New City: ");
                String city = scanner.nextLine();

                System.out.print("New State: ");
                String state = scanner.nextLine();

                System.out.print("New Zip: ");
                String zip = scanner.nextLine();

                c.updateContact(phone, email, new Address(city, state, zip));
                System.out.println(" Contact updated.");
                return;
            }
        }
        System.out.println(" Contact not found.");
    }

    private static void deleteContact() {

        System.out.print("Enter First Name to delete: ");
        String name = scanner.nextLine();

        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(name)) {
                contacts.remove(c);
                System.out.println(" Contact deleted.");
                return;
            }
        }
        System.out.println(" Contact not found.");
    }

    private static void searchByCityOrState() {

        System.out.print("Enter City or State: ");
        String input = scanner.nextLine();

        for (Contact c : contacts) {
            Address a = c.getAddress();
            if (a.getCity().equalsIgnoreCase(input)
                    || a.getState().equalsIgnoreCase(input)) {
                System.out.println(c);
            }
        }
    }

    private static void displayAllContacts() {
        Collections.sort(contacts,
                Comparator.comparing(Contact::getFullName));

        System.out.println("\n Contact List:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
