package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;

    // Default constructor
    public Library() {
        this.name = "";
        this.books = new ArrayList<>();
    }

    // Parameterized constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // toString method
    @Override
    public String toString() {
        return "Library{name='" + name + "', books=" + books + "}";
    }
}
