package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"proxies", "repositories", "services"})
@EnableAspectJAutoProxy
public class ProjectConfiguration {
}
