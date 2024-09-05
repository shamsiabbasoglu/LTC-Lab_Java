package com.bookstore.service;

import lombok.RequiredArgsConstructor;
import com.bookstore.dto.requestdto.AuthorRequestDto;
import com.bookstore.dto.responsedto.AuthorResponseDto;
import com.bookstore.model.Author;
import com.bookstore.repo.AuthorRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepo authorRepo;
    private final ModelMapper modelMapper;

    public AuthorResponseDto addAuthor(AuthorRequestDto authorRequestDto) {
        Author author = modelMapper.map(authorRequestDto, Author.class);
        return modelMapper.map(authorRepo.save(author), AuthorResponseDto.class);
    }

    public List<AuthorResponseDto> getAllAuthors() {
        List<Author> authors = authorRepo.findAll();
        return authors.stream()
                .map(e -> modelMapper.map(e, AuthorResponseDto.class))
                .toList();
    }

    public AuthorResponseDto getAuthorById(Long id) {
        Author author = authorRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Author not found"));
        return modelMapper.map(author, AuthorResponseDto.class);
    }

    public AuthorResponseDto updateAuthor(Long id, AuthorRequestDto authorRequestDto) {
        Author author = authorRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Author not found"));
        modelMapper.map(authorRequestDto, author);
        return modelMapper.map(authorRepo.save(author), AuthorResponseDto.class);
    }

    public AuthorResponseDto deleteAuthor(Long id) {
        Author author = authorRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Author not found"));
        authorRepo.delete(author);
        return modelMapper.map(author, AuthorResponseDto.class);
    }
}
