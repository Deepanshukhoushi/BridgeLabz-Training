package com.bookshelf;
import java.util.Scanner;
public class BookShelfApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		LibraryOrganizer library = new LibraryOrganizer();
		System.out.println("Enter no. of books you want to add: ");
		int num = input.nextInt();
		
		for (int i = 0; i<num; i++) {
			System.out.println("Enter Book. " + (i+1) + " Genre, Title and Author name: ");
			String genre = input.next();
			String title = input.nextLine();
			input.nextLine();
			String author = input.nextLine();
			library.addBook(genre, new Book(title, author));
		}
		
		
		library.displayCatalog();
		System.out.println("Enter Book genre and title to Borrorw Book: ");
		String genre = input.next();
		String title = input.nextLine();
		input.nextLine();
		library.borrowBook(genre, title);
		
		
		library.displayCatalog();
		
		String genre1 = input.next();
		String title1 = input.nextLine();
		input.nextLine();
		String author = input.nextLine();
		library.returnBook(genre1, new Book(title1, author));
		library.displayCatalog();
		input.close();
		
	}
}
