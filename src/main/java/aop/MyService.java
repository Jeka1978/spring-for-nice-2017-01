package aop;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 17/01/2017.
 */
@Component
public class MyService {

    public void fooKaki(){
        System.out.println("Again!!!! In the middle of the night???");

    }
    public void helloFather(){
        System.out.println("helloFather");
    }
}
