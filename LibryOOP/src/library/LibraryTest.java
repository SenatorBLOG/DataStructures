package library;

import java.util.Collections;

public class LibraryTest {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("The Hobbit", 1937, "J.R.R. Tolkien");
        Book book2 = new Book("1984", 1949, "George Orwell");

        // Create library
        Library library = new Library("City Library");

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);

        // Print library details
        System.out.println(library);

        // Print type of first book
        System.out.println("Type of first book: " + book1.getType());

        // Sort books by year and print updated library
        Collections.sort(library.getBooks());
        System.out.println("Library after sorting by year: " + library);
    }
}
