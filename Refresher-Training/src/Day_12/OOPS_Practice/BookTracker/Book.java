package Day_12.OOPS_Practice.BookTracker;

public class Book {
    private String title;
    private String author;
    private String isbn;

    static int totalBooksInLibrary = 0;
    static int totalBooksCheckedOut = 0;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooksInLibrary++;
    }

    public void checkOut(){
        totalBooksCheckedOut++;
    }

    public void returnBook(){
        totalBooksCheckedOut--;
    }
}
