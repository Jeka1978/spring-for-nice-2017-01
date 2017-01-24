package niceMethodToWriteTests;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Evegeny on 24/01/2017.
 */
@Configuration
@ComponentScan(basePackages = "niceMethodToWriteTests")
public class MockConfig {

   /* @Bean
    public MyService myService(){
        return new MyService() {
            @Override
            public void doWork() {
                System.out.println("I'm a mock");
            }
        };
    }*/

    @Bean
    @Real
    public MyService myServiceReal() {
        return new MyServiceImpl();
    }


}
