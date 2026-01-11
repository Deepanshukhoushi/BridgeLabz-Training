package com.bookshelf;
public class Book {
	String title;
	String author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public boolean equals(Object o){
		if(this==o) return true;
		if(!(o instanceof Book)) return false;
		
		Book b = (Book) o;
		return title.equals(b.title) && author.equals(b.author);
	}
	
	@Override
	public int hashCode() {
		return title.hashCode()+author.hashCode();
	}
	
	@Override
	public String toString() {
		return title + " by " + author;
	}
}
