package Day_12.OOPS_Practice.BookTracker;

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book("First", "Author a", "r3IS");
        Book b2 = new Book("Second", "Author b", "b3IS");
        Book b3 = new Book("Third", "Author c", "2rIS");
        Book b4 = new Book("Fourth", "Author d", "d3IS");
        Book b5 = new Book("Fifth", "Author e", "2jIS");
        Book b6 = new Book("Sixth", "Author f", "2xIS");

        b1.checkOut();
        b2.checkOut();
        b3.checkOut();

        b2.returnBook();

        System.out.println("Total no. in Library: " + Book.totalBooksInLibrary);
        System.out.println("Total books checked out: " + Book.totalBooksCheckedOut);
    }
}
