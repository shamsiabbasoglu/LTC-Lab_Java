package mentor.bookstore.controller;


import lombok.RequiredArgsConstructor;
import mentor.bookstore.dto.BookDto;
import mentor.bookstore.entity.Book;
import mentor.bookstore.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class BookController {

    private final BookService bookService;

    @PostMapping("/create")
    public String add(@RequestBody BookDto book) {
        bookService.createBook(book);
        return "success";
    }

    @GetMapping("/getAll")
    public List<Book> getAll() {
        return bookService.getAllBooks();
    }

    @GetMapping("/get{id}")
    public Book get(@PathVariable Long id) {
        return bookService.getBookById(id);
    }
}