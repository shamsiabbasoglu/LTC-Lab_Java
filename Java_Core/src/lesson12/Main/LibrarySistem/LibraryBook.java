package lesson12.Main.LibrarySistem;

public class LibraryBook {
    private String title;
    private String author;
    private int yearPublished;
    private boolean checkedOut;

    public LibraryBook(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    //Method to check out the book
    public void checkOut() {
        checkedOut = true;
    }

    //Method to return the book
    public void returnBook() {
        checkedOut = false;
    }

    //Method to check if book is available
    public boolean isAvailable() {
        return !checkedOut;
    }

    @Override
    public String toString() {
        return "Book {" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }
}
