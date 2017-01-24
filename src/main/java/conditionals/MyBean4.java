package conditionals;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 24/01/2017.
 */
@Component
@Prod
public class MyBean4 {

    @PostConstruct
    public void printMyName(){
        System.out.println(getClass().getSimpleName());
    }
}
