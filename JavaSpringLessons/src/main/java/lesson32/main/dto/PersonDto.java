package lesson32.main.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class PersonDto {
    private String firstName;
    private String lastName;
    private Integer age;
    private Long id;
}
