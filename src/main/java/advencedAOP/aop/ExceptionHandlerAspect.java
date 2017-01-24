package advencedAOP.aop;

import advencedAOP.business.DBException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by Evegeny on 24/01/2017.
 */
@Component
@Aspect
public class ExceptionHandlerAspect {


    private Map<DBException, Void> map = new WeakHashMap<>();

    @Value("${dbaMails}")
    private String[] mails;

    @Pointcut("execution(* advencedAOP.business..*.*(..))")
    public void allBusinessMethods(){}


    @AfterThrowing(pointcut = "allBusinessMethods()", throwing = "ex")
    public void handleDBException(DBException ex) {
        if (!map.containsKey(ex)) {
            for (String mail : mails) {
                System.out.println("sending mail to "+mail+" "+ex.getMessage());
            }
            map.put(ex,null);
        }
    }
}





















