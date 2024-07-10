package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Comment {
    private String author;
    private String text;
}
