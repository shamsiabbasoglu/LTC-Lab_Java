package com.bookstore.controller;

import com.bookstore.dto.requestdto.BookRequestDto;
import lombok.RequiredArgsConstructor;
import com.bookstore.dto.responsedto.BookResponseDto;
import com.bookstore.model.Author;
import com.bookstore.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    @PostMapping("/create")
    public BookResponseDto add(@RequestBody BookRequestDto bookRequestDto) {
        return bookService.createBook(bookRequestDto);
    }

    @GetMapping("/getAll")
    public List<BookResponseDto> getAll() {
        return bookService.getAllBooks();
    }

    @GetMapping("/findId/{id}")
    public BookResponseDto findById(@PathVariable Long id) {
        return bookService.findBookById(id);
    }

    @PutMapping("/updateId/{id}")
    public BookResponseDto update(@PathVariable Long id, @RequestBody BookRequestDto bookRequestDto) {
        return bookService.updateBook(id, bookRequestDto);
    }

    @DeleteMapping("/deleteId/{id}")
    public BookResponseDto delete(@PathVariable Long id) {
        return bookService.deleteBook(id);
    }
}