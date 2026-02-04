package com.designpattern.librarymanagementsystem.builder;

import java.util.Arrays;

public class BuilderMain {
    public static void main(String[] args) {

        Book book1 = new Book.BookBuilder("Data Structures")
                .authors(Arrays.asList("Cormen", "Leiserson"))
                .edition("3rd Edition")
                .genre("Computer Science")
                .publisher("MIT Press")
                .build();

        Book book2 = new Book.BookBuilder("Clean Code")
                .authors(Arrays.asList("Robert C. Martin"))
                .build();

        System.out.println(book1);
        System.out.println(book2);
    }
}
