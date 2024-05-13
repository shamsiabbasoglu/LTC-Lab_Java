package lesson22.Main.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Legends", "No Name", 19.99, "1883"));
        books.add(new Book("Dumbs", "Example", 14.99, "1777"));
        books.add(new Book("Freaks", "Folk", 9.99, "1899"));
        books.add(new Book("Needs", "Special", 9.99, "1789"));
        books.add(new Book("Goods", "Economics", 9.99, "1919"));

        Collections.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println();
        books.sort(new Comparator<>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() == o2.getPrice()) {
                    return o2.getPublicationYear().compareTo(o1.getPublicationYear());
                }
                return 0;
            }
        });

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
