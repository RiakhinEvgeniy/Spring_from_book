package chapter_2;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Component
public class Person {
    private String name;
    private  Parrot2 parrot2;

    public Person(Parrot2 parrot2) {
        this.parrot2 = parrot2;
    }
}
