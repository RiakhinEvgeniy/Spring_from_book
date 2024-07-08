package chapter_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "chapter_2")
public class ProjectConfig2 {

    @Bean(name = "koko")
    public Parrot2 parrot() {
        return new Parrot2("Koko");
    }

    @Bean(name = "miki")
    public Parrot2 parrot2() {
        return new Parrot2("Miki");
    }

    @Bean
    public Person person(@Qualifier("koko") Parrot2 parrot2) {
        Person person = new Person();
        person.setName("Ella");
        person.setParrot2(parrot2);
        return person;
    }
}
