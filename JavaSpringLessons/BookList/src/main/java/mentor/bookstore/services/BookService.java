package mentor.bookstore.services;

import mentor.bookstore.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class BookService {
    private final List<Book> books = new ArrayList<>();

    @PostMapping
    public String addBook(String title, String author, Double price) {
        Book book = new Book();
        Book.builder()
                .id(1L)
                .title(title)
                .author(author)
                .price(price)
                .build();
        books.add(book);
        return book.toString();
    }

    @GetMapping
    public String getBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book.toString();
            }
        }
        return null;
    }

    @PutMapping
    public String updateBookPrice(Long id, Double price) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                book.setPrice(price);
                return book.toString();
            }
        }
        return null;
    }
}
