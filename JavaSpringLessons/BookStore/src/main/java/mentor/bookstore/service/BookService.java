package mentor.bookstore.service;

import lombok.RequiredArgsConstructor;
import mentor.bookstore.dto.BookDto;
import mentor.bookstore.entity.BookEntity;
import mentor.bookstore.repo.BookRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepo bookRepo;
    private final ModelMapper modelMapper;

    public BookDto createBook(BookDto bookDto) {
        BookEntity book = modelMapper.map(bookDto, BookEntity.class);
        return modelMapper.map(bookRepo.save(book), BookDto.class);
    }

    public List<BookDto> getAllBooks() {
        List<BookEntity> bookEntities = bookRepo.findAll();
        return bookEntities.stream()
                .map(entity -> modelMapper.map(entity, BookDto.class))
                .toList();
    }

    public BookDto findBookById(Long id) {
        BookEntity bookEntity = bookRepo.findById(id).orElse(null);
        return modelMapper.map(bookEntity, BookDto.class);
    }

    public List<BookDto> findBookByAuthor(String author) {
        List<BookEntity> bookEntities = bookRepo.findByAuthor(author);
        return bookEntities.stream()
                .map(entity -> modelMapper.map(entity, BookDto.class))
                .toList();
    }

    public BookDto updateBook(Long id, BookDto book) {
            BookEntity bookEntity = bookRepo.findById(id).orElseThrow();
            modelMapper.map(book, bookEntity);
            return modelMapper.map(bookRepo.save(bookEntity), BookDto.class);
    }

    public BookDto deleteBook(Long id) {
        if (bookRepo.existsById(id)) {
            BookEntity bookEntity = bookRepo.findById(id).orElseThrow();
            bookRepo.delete(bookEntity);
            return modelMapper.map(bookEntity, BookDto.class);
        } else {
            return null;
        }
    }
}
