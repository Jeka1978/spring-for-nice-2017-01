package niceMethodToWriteTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Evegeny on 24/01/2017.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MockConfig.class)
public class AnotherServiceTest {
    @Autowired
    private AnotherService anotherService;

    @Test
    public void doStuff() throws Exception {

     /*   ExecutorService executorService = Executors.newFixedThreadPool(4);

        executorService.submit(() -> System.out.println("2423"));*/



        MyService myServiceMock = mock(MyService.class);



        anotherService.doStuff();
    }

}
















