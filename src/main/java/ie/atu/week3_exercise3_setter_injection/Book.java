package ie.atu.week3_exercise3_setter_injection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int publishedYear;
}
