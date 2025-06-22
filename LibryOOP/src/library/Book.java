package library;

public class Book extends Publication implements Comparable<Book> {
    private String author;

    // Default constructor
    public Book() {
        super();
        this.author = "";
    }

    // Parameterized constructor
    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    // Getters and setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // toString method
    @Override
    public String toString() {
        return "Book{" + super.toString() + ", author='" + author + "'}";
    }

    // Override getType
    @Override
    public String getType() {
        return "Book";
    }

    // Implement Comparable
    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.getYear(), other.getYear());
    }
}
