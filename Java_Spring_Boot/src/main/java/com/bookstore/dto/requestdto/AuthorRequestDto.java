package com.bookstore.dto.requestdto;

import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AuthorRequestDto {
    private String firstName;
    private String lastName;
}
