package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    protected Parrot parrot() {
        return new Parrot("Koko");
    }
}
