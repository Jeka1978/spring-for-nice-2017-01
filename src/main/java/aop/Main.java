package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Evegeny on 17/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);

//        context.getBean(Secured.class)

       /* MyService myService = context.getBean(MyService.class);
        myService.fooKaki();
        myService.helloFather();*/
    }
}
