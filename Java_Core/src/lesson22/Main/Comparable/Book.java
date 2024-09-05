package lesson22.Main.Comparable;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private double price;
    private String publicationYear;

    public Book(String title, String author, double price, String publicationYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Book o) {
        return Double.compare(price,o.price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publicationYear='" + publicationYear + '\'' +
                '}';
    }
}
