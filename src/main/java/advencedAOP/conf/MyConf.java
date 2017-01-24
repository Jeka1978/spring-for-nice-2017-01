package advencedAOP.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Evegeny on 24/01/2017.
 */
@Configuration
@ComponentScan(basePackages = {"advencedAOP.business","advencedAOP.aop"})
@EnableAspectJAutoProxy
@PropertySource("classpath:mail.properties")
public class MyConf {
}
