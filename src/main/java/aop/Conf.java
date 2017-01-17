package aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Evegeny on 17/01/2017.
 */
@ComponentScan(basePackages = "aop")
@Configuration
@EnableAspectJAutoProxy
public class Conf {
}
