package com.annotationsandreflection.reflection.retrieveannotations;

public class AnnotationReader {

    public static void main(String[] args) {

        try {
            Class<Book> clazz = Book.class;

            if (clazz.isAnnotationPresent(Author.class)) {

                Author author = clazz.getAnnotation(Author.class);

                System.out.println("Author Name: " + author.name());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
