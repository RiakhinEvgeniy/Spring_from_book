package spring;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Parrot {
    private String name;

}
