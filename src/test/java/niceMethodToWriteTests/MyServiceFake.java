package niceMethodToWriteTests;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 24/01/2017.
 */
@Service
@Primary
public class MyServiceFake implements MyService {
    @Override
    public void doWork() {
        System.out.println("I'm a fake");
    }
}
