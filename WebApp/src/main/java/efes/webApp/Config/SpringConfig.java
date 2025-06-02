package efes.webApp.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "efes.webApp")
@PropertySource("classpath:application.properties")
public class SpringConfig {
}
