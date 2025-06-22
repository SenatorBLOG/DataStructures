package library;

public abstract class Publication {
    private String title;
    private int year;

    // Default constructor
    public Publication() {
        this.title = "";
        this.year = 0;
    }

    // Parameterized constructor
    public Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method
    @Override
    public String toString() {
        return "Publication{title='" + title + "', year=" + year + "}";
    }

    // Abstract method
    public abstract String getType();
}
