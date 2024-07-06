package chapter_2;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Component
public class Person {
    private String name;
    @Autowired
    private Parrot2 parrot2;
}
