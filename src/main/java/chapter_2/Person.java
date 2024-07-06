package chapter_2;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Setter
@Getter
@ToString
@Component
public class Person {
    private String name;
    private final Parrot2 parrot2;

    @Autowired
    public Person(Parrot2 parrot2) {
        this.parrot2 = parrot2;
    }
}
