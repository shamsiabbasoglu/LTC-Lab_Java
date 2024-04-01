package lesson09.Main.BookTask;

public class Book {
    String title;
    Author author;
    int publicYear;

    public Book(String title, Author author, int publicYear) {
        this.title = title;
        this.author = author;
        this.publicYear = publicYear;
    }
    @Override
    public String toString() {
        return "Book: " + title + " (Author: " + author.getName() + ", Publish year: " + publicYear + ")";
    }
}
