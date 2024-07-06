package chapter_2;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Parrot2 {
    private String name;

    @Override
    public String toString() {
        return "Name parrot: " + name;
    }
}
