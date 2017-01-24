package aop;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 24/01/2017.
 */
@Service
public class SecuredService {
    @Secured
    public void doWork(){
        System.out.println("This is very secured method, only for admins");
    }
}
