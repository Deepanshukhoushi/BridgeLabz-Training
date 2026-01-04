package com.linkedlist.doubly.librarymanagementsystem;

class LibraryDoublyLinkedList {

    private BookNode head;
    private BookNode tail;

    /* Add at Beginning */
    public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Book added at beginning.");
    }

    /* Add at End */
    public void addAtEnd(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Book added at end.");
    }

    /* Add at Position */
    public void addAtPosition(int pos, int id, String title, String author, String genre, boolean available) {
        if (pos <= 1) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, available);
            return;
        }

        BookNode newNode = new BookNode(id, title, author, genre, available);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

        System.out.println("Book added at position " + pos);
    }

    /* Remove by Book ID */
    public void removeById(int id) {
        BookNode temp = head;

        while (temp != null && temp.bookId != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found.");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Book removed.");
    }

    /* Search by Title */
    public void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Book not found.");
    }

    /* Search by Author */
    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No books found for this author.");
    }

    /* Update Availability */
    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    /* Display Forward */
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    /* Display Reverse */
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }

        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    /* Count Books */
    public void countBooks() {
        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total books in library: " + count);
    }

    private void displayBook(BookNode b) {
        System.out.println("------------------------");
        System.out.println("Book ID   : " + b.bookId);
        System.out.println("Title     : " + b.title);
        System.out.println("Author    : " + b.author);
        System.out.println("Genre     : " + b.genre);
        System.out.println("Available : " + (b.isAvailable ? "Yes" : "No"));
    }
}

