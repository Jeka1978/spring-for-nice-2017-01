package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Evegeny on 24/01/2017.
 *
 */
@Component
@Aspect
public class SecurityAspect {

    @Pointcut("@annotation(Secured)")
    public void securedMethods(){}


    @Around("securedMethods()")
    public void doSecured(ProceedingJoinPoint pjp) throws Throwable {
        if (isAdmin()) {
            pjp.proceed();
            System.out.println("thank you ADMIN!!!");
        }else {
            throw new SecurityException("not allowed here, try again later :)");
        }
    }

    private boolean isAdmin() {
        Random random = new Random();
        return random.nextInt(3) == 1;
    }
}




















