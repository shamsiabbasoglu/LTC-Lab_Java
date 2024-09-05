package com.bookstore.dto.responsedto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookResponseDto {
    private Long id;
    private String title;
    private Double price;
    private Integer year;
    private List<AuthorResponseDto> authors;
    private List<CategoryResponseDto> categories;
}
