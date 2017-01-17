package quoters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Evegeny on 17/01/2017.
 */
@Configuration
@PropertySource("classpath:application.properties")
public class Config {
}
