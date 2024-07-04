package mentor.bookstore.dto;

import lombok.Data;

@Data
public class BookDto {
    private String title;
    private String author;
    private Double price;
    private Integer isbn;
}
