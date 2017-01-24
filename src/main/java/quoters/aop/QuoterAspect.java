package quoters.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 24/01/2017.
 */
@Component
@Aspect
public class QuoterAspect {

    @Pointcut("execution(* quoters..*.say*(..))")
    public void sayMethods(){}

    @Pointcut("@annotation(Deprecated)")
    public void deprecatedMethods(){}


    @Before("sayMethods()")
    public void handleSayMethodsBefore(JoinPoint jp) {
        String simpleName = jp.getTarget().getClass().getSimpleName();
        System.out.println("this is quote of "+simpleName);
    }

    @After("sayMethods()")
    public void handleSayMethodsAfter(JoinPoint jp) {
        String simpleName = jp.getThis().getClass().getName();
        System.out.println("this is quote of "+simpleName);
    }



}







