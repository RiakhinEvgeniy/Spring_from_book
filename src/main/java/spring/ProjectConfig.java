package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    protected Parrot parrot() {
        return new Parrot("Koko");
    }

    @Bean
    protected String getString() {
        return "Hello World";
    }

    @Bean
    protected Integer getInt() {
        return 42;
    }
}
