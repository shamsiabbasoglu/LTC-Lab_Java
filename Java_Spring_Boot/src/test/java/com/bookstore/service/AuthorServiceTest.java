package com.bookstore.service;

import com.bookstore.dto.requestdto.AuthorRequestDto;
import com.bookstore.dto.responsedto.AuthorResponseDto;
import com.bookstore.model.Author;
import com.bookstore.repo.AuthorRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class AuthorServiceTest {

    @InjectMocks
    private AuthorService authorService;

    @Mock
    private ModelMapper modelMapper;

    @Mock
    private AuthorRepo authorRepo;

    private Author author;
    private AuthorRequestDto authorRequestDto;
    private AuthorResponseDto authorResponseDto;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        author = Author.builder()
                .id(1L)
                .firstName("John")
                .lastName("Doe")
                .build();

        authorRequestDto = AuthorRequestDto.builder()
                .firstName("John")
                .lastName("Doe")
                .build();

        authorResponseDto = AuthorResponseDto.builder()
                .id(1L)
                .firstName("John")
                .lastName("Doe")
                .build();
    }

    @Test
    void testAddAuthor() {
        // Given
        when(modelMapper.map(authorRequestDto, Author.class)).thenReturn(author);
        when(authorRepo.save(author)).thenReturn(author);
        when(modelMapper.map(author, AuthorResponseDto.class)).thenReturn(authorResponseDto);

        // When
        AuthorResponseDto result = authorService.addAuthor(authorRequestDto);

        // Then
        assertNotNull(result);
        assertEquals(1L, result.getId());
        assertEquals("John", result.getFirstName());
        assertEquals("Doe", result.getLastName());

        verify(modelMapper, times(1)).map(authorRequestDto, Author.class);
        verify(authorRepo, times(1)).save(author);
        verify(modelMapper, times(1)).map(author, AuthorResponseDto.class);
    }

    @Test
    void testGetAuthorById() {
        // Given
        Long id = 1L;
        when(authorRepo.findById(id)).thenReturn(Optional.of(author));
        when(modelMapper.map(author, AuthorResponseDto.class)).thenReturn(authorResponseDto);

        // When
        AuthorResponseDto result = authorService.getAuthorById(id);

        // Then
        assertNotNull(result);
        assertEquals(id, result.getId());

        verify(authorRepo, times(1)).findById(id);
        verify(modelMapper, times(1)).map(author, AuthorResponseDto.class);
    }

    @Test
    void testUpdateAuthor() {
        // Given
        Long id = 1L;
        when(authorRepo.findById(id)).thenReturn(Optional.of(author));
        when(authorRepo.save(author)).thenReturn(author);
        when(modelMapper.map(author, AuthorResponseDto.class)).thenReturn(authorResponseDto);

        // When
        AuthorResponseDto result = authorService.updateAuthor(id, authorRequestDto);

        // Then
        assertNotNull(result);
        assertEquals(id, result.getId());
        assertEquals("John", result.getFirstName());
        assertEquals("Doe", result.getLastName());

        verify(authorRepo, times(1)).findById(id);
        verify(modelMapper, times(1)).map(authorRequestDto, author);
        verify(authorRepo, times(1)).save(author);
        verify(modelMapper, times(1)).map(author, AuthorResponseDto.class);
    }

    @Test
    void testDeleteAuthor() {
        // Given
        Long id = 1L;
        when(authorRepo.findById(id)).thenReturn(Optional.of(author));
        when(modelMapper.map(author, AuthorResponseDto.class)).thenReturn(authorResponseDto);

        // When
        AuthorResponseDto result = authorService.deleteAuthor(id);

        // Then
        assertNotNull(result);
        assertEquals(id, result.getId());

        verify(authorRepo, times(1)).findById(id);
        verify(authorRepo, times(1)).delete(author);
        verify(modelMapper, times(1)).map(author, AuthorResponseDto.class);
    }
}
