package com.bookshelf;
import java.util.*;

class LibraryOrganizer{
	private HashMap<String, LinkedList<Book>> catalog;
	private HashSet<Book> allBooks;
	
	public LibraryOrganizer() {
		catalog = new HashMap<>();
		allBooks = new HashSet<>();
		
	}
	public void addBook(String genre, Book book) {
		if (allBooks.contains(book)) {
			System.out.println("Duplicate book ignored: " + book);
			return;
		}
		catalog.putIfAbsent(genre, new LinkedList<>());
		catalog.get(genre).add(book);
		allBooks.add(book);
		
		System.out.println("Added: " + book + " in genre: " + genre);
	}
	public void borrowBook(String genre, String title) {
		LinkedList<Book> books = catalog.get(genre);
		if(books == null) {
			System.out.println("No such genre found");
			return;
		}
		Iterator<Book> it = books.iterator();
		while (it.hasNext()) {
			Book b = it.next();
			if (b.title.equals(title)) {
				it.remove();
				System.out.println("Borrowed: " + b);
				return;
			}
		}
		System.out.println("Book not found: " + title);
	}
	public void returnBook(String genre, Book book) {
		catalog.putIfAbsent(genre, new LinkedList<>());
		catalog.get(genre).add(book);
		allBooks.add(book);
		System.out.println("Returned: " + book);
		
	}
	public void displayCatalog() {
		for(String genre: catalog.keySet()) {
			System.out.println("\nGenre: " + genre);
			for(Book b : catalog.get(genre)) {
				System.out.println(" - " + b);
			}
		}
	}
}
