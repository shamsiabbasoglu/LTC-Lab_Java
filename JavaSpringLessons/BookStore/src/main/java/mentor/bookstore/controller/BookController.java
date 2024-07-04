package mentor.bookstore.controller;

import lombok.RequiredArgsConstructor;
import mentor.bookstore.dto.BookDto;
import mentor.bookstore.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BookController {
    private final BookService bookService;

    @PostMapping("/create")
    public BookDto add(@RequestBody BookDto book) {
        return bookService.createBook(book);
    }

    @GetMapping("/getAll")
    public List<BookDto> getAll() {
        return bookService.getAllBooks();
    }

    @GetMapping("/findId/{id}")
    public BookDto findById(@PathVariable Long id) {
        return bookService.findBookById(id);
    }

    @GetMapping("/findAuthor/{author}")
    public List<BookDto> findByAuthor(@PathVariable String author) {
        return bookService.findBookByAuthor(author);
    }

    @PutMapping("/updateId/{id}")
    public BookDto update(@PathVariable Long id, @RequestBody BookDto book) {
        return bookService.updateBook(id, book);
    }

    @DeleteMapping("/deleteId/{id}")
    public BookDto delete(@PathVariable Long id) {
        return bookService.deleteBook(id);
    }
}