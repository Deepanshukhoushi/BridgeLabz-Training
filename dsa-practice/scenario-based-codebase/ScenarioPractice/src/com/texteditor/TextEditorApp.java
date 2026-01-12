package com.texteditor;
import java.util.Scanner;

public class TextEditorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Editor editor = new Editor();
        UndoRedoManager manager = new UndoRedoManager();
        int choice;

        do {
            System.out.println("\nCurrent Text: \"" + editor.getText() + "\"");
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter text: ");
                    String insertText = sc.nextLine();
                    editor.insert(insertText);
                    manager.recordAction(new Action("INSERT", insertText));
                    break;

                case 2:
                    System.out.print("Enter number of characters to delete: ");
                    int count = sc.nextInt();

                    if (count > editor.length()) {
                        System.out.println("Not enough text to delete");
                        break;
                    }

                    String deletedText = editor.getText()
                            .substring(editor.length() - count);

                    editor.delete(count);
                    manager.recordAction(new Action("DELETE", deletedText));
                    break;

                case 3:
                    manager.undo(editor);
                    break;

                case 4:
                    manager.redo(editor);
                    break;

                case 5:
                    System.out.println("Exiting editor...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
