package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(name = "koko")
    protected Parrot parrot() {
        return new Parrot("Koko");
    }

    @Bean(name = "kesha")
    protected Parrot getKesha() {
        return new Parrot("Kesha");
    }

    @Bean(name = "vasia")
    protected Parrot getVasia() {
        return new Parrot("Vasia");
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
