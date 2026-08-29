package oop.class_problems;

public class LibraryBook {
    String title;
    String isbn;

    // Full constructor
    public LibraryBook(String title, String isbn) {
        this.title = title;
        // If ISBN is missing or blank, set to PENDING
        if (isbn == null || isbn.trim().isEmpty()) {
            this.isbn = "PENDING";
        } else {
            this.isbn = isbn;
        }
    }

    // Overloaded constructor chaining via this(...)
    public LibraryBook(String title) {
        this(title, "PENDING");
    }

    public void printStatus() {
        System.out.println(title + " | " + isbn + " | Catalogued: true");
    }

    public static void main(String[] args) {
        String[] titles = {"Clean Code", "Untitled Draft", "1984", "Notes"};
        String[] isbns = {"978-0132350884", "", "9780451524935", ""};

        for (int i = 0; i < titles.length; i++) {
            LibraryBook book = new LibraryBook(titles[i], isbns[i]);
            book.printStatus();
        }
    }
}
