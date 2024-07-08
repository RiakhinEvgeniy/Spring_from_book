package chapter_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig2 {

    @Bean
    public Parrot2 parrot() {
        return new Parrot2("Koko");
    }

    @Bean
    public Parrot2 parrot2() {
        return new Parrot2("Miki");
    }

    @Bean
    public Person person(@Qualifier("parrot") Parrot2 parrot2) {
        Person person = new Person();
        person.setName("Ella");
        person.setParrot2(parrot2);
        return person;
    }
}
