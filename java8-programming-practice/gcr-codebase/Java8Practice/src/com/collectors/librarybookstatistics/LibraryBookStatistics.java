package com.collectors.librarybookstatistics;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryBookStatistics {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
            new Book("Book A", "Fiction", 300),
            new Book("Book B", "Fiction", 450),
            new Book("Book C", "Science", 500),
            new Book("Book D", "Science", 350),
            new Book("Book E", "History", 400)
        );

        Map<String, IntSummaryStatistics> statsByGenre =
                books.stream()
                     .collect(Collectors.groupingBy(
                         Book::getGenre,
                         Collectors.summarizingInt(Book::getPages)
                     ));

        System.out.println("Library Book Statistics (Per Genre):");

        statsByGenre.forEach((genre, stats) -> {
            System.out.println("\nGenre: " + genre);
            System.out.println("Total Pages   : " + stats.getSum());
            System.out.println("Average Pages : " + stats.getAverage());
            System.out.println("Max Pages     : " + stats.getMax());
        });
    }
}
