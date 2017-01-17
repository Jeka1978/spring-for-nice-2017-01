package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 17/01/2017.
 */
@Component
@Aspect
public class FooAspect {

    @Before("execution(* aop..*.foo*(..))")
    public void handleMethodsStartingWithFoo(JoinPoint jp) {
//        jp.getTarget().getClass().getName()
        System.out.println("mail sent, please replace titul for your dautgher");
    }
}
