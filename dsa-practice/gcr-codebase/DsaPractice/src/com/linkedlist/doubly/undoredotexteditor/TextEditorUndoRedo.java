package com.linkedlist.doubly.undoredotexteditor;

import java.util.Scanner;

public class TextEditorUndoRedo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UndoRedoManager manager = new UndoRedoManager();
        int choice;

        do {
            System.out.println("\n--- Text Editor Undo/Redo ---");
            System.out.println("1. Type / Add Text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display Current Text");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter text: ");
                    String text = sc.nextLine();
                    manager.addState(text);
                    System.out.println("Text added.");
                }

                case 2 -> manager.undo();

                case 3 -> manager.redo();

                case 4 -> manager.displayCurrentState();

                case 5 -> System.out.println("Exiting editor...");

                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
