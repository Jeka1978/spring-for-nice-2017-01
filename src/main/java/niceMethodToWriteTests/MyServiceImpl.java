package niceMethodToWriteTests;

import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 24/01/2017.
 */
@Service
public class MyServiceImpl implements MyService {
    @Override
    public void doWork() {
        System.out.println("prod service");
    }
}
