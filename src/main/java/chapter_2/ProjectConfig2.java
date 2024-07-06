package chapter_2;

import org.springframework.context.annotation.Bean;

public class ProjectConfig2 {

    @Bean
    public Parrot2 getParrot() {
        return new Parrot2("Chapter2");
    }

    @Bean
    public Person getPerson(Parrot2 parrot2) {
        Person person = new Person();
        person.setName("David");
        person.setParrot2(parrot2);
        return person;
    }
}
