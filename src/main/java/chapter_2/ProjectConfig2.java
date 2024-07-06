package chapter_2;

import org.springframework.context.annotation.Bean;

public class ProjectConfig2 {

    @Bean
    public Parrot2 getParrot() {
        return new Parrot2("Parrot2");
    }

    @Bean
    public Person getPerson() {
        Person person = new Person();
        person.setName("David");
        person.setParrot2(getParrot());
        return person;
    }
}
