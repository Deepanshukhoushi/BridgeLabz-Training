package com.inheritance.single.librarymanagement;

public class LibraryMain {
	public static void main(String[] args) {

        Author bookAuthor = new Author(
                "Effective Java",
                2018,
                "Joshua Bloch",
                "Expert in Java best practices"
        );

        bookAuthor.displayInfo();
    }
}
