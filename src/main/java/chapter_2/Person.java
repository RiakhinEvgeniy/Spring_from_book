package chapter_2;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Person {
    private String name;
    private Parrot2 parrot2;
}
