package com.designpattern.librarymanagementsystem.builder;

import java.util.List;

public class Book {

    private final String title;
    private final List<String> authors;
    private final String edition;
    private final String genre;
    private final String subGenre;
    private final String publisher;

    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.authors = builder.authors;
        this.edition = builder.edition;
        this.genre = builder.genre;
        this.subGenre = builder.subGenre;
        this.publisher = builder.publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", edition='" + edition + '\'' +
                ", genre='" + genre + '\'' +
                ", subGenre='" + subGenre + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    // 🔧 Builder Class
    public static class BookBuilder {

        // Required field
        private final String title;

        // Optional fields
        private List<String> authors;
        private String edition;
        private String genre;
        private String subGenre;
        private String publisher;

        public BookBuilder(String title) {
            this.title = title;
        }

        public BookBuilder authors(List<String> authors) {
            this.authors = authors;
            return this;
        }

        public BookBuilder edition(String edition) {
            this.edition = edition;
            return this;
        }

        public BookBuilder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder subGenre(String subGenre) {
            this.subGenre = subGenre;
            return this;
        }

        public BookBuilder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book build() {
            return new Book(this);
        }

		@Override
		public String toString() {
			return "BookBuilder [title=" + title + ", authors=" + authors + ", edition=" + edition + ", genre=" + genre
					+ ", subGenre=" + subGenre + ", publisher=" + publisher + "]";
		}
        
        
    }
}
