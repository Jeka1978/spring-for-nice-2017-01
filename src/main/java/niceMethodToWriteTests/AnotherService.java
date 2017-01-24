package niceMethodToWriteTests;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 24/01/2017.
 */
@Service
@Setter
public class AnotherService {
    @Autowired
    private MyService myService;


    public void doStuff(){
        myService.doWork();
    }
}
