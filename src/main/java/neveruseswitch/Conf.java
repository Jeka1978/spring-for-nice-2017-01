package neveruseswitch;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Evegeny on 17/01/2017.
 */
@Configuration
@EnableScheduling
@ComponentScan(basePackages = "neveruseswitch")
public class Conf {
}
