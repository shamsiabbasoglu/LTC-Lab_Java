package mentor.bookstore.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Book {
    private Long id;
    private String title;
    private String author;
    private Double price;
}
