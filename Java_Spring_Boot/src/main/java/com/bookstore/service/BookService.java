package com.bookstore.service;

import com.bookstore.dto.requestdto.BookRequestDto;
import com.bookstore.dto.responsedto.BookResponseDto;
import com.bookstore.model.Author;
import com.bookstore.model.Book;
import com.bookstore.model.Category;
import com.bookstore.repo.AuthorRepo;
import com.bookstore.repo.BookRepo;
import com.bookstore.repo.CategoryRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepo bookRepo;
    private final AuthorRepo authorRepo;
    private final CategoryRepo categoryRepo;
    private final ModelMapper modelMapper;

    @Transactional
    public BookResponseDto createBook(BookRequestDto bookRequestDto) {
        Book book = modelMapper.map(bookRequestDto, Book.class);

        List<Author> authors = authorRepo.findAllById(bookRequestDto.getAuthorIds());
        book.setAuthors(authors);

        List<Category> categories = categoryRepo.findAllById(bookRequestDto.getCategoryIds());
        book.setCategories(categories);

        Book savedBook = bookRepo.save(book);

        categories.forEach(category -> category.getBooks().add(savedBook));

        return modelMapper.map(savedBook, BookResponseDto.class);
    }

    public List<BookResponseDto> getAllBooks() {
        List<Book> bookEntities = bookRepo.findAll();
        return bookEntities.stream()
                .map(entity -> modelMapper.map(entity, BookResponseDto.class))
                .toList();
    }

    public BookResponseDto findBookById(Long id) {
        Book bookEntity = bookRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Book not found"));
        return modelMapper.map(bookEntity, BookResponseDto.class);
    }

    public BookResponseDto updateBook(Long id, BookRequestDto bookRequestDto) {
        Book book = bookRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Book not found"));
        modelMapper.map(bookRequestDto, book);
        return modelMapper.map(bookRepo.save(book), BookResponseDto.class);
    }

    public BookResponseDto deleteBook(Long id) {
        Book bookEntity = bookRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Book not found"));
        bookRepo.delete(bookEntity);
        return modelMapper.map(bookEntity, BookResponseDto.class);
    }
}
