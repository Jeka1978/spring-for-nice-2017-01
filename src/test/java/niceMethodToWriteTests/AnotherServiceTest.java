package niceMethodToWriteTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

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

        MyService myServiceMock = mock(MyService.class);



        anotherService.doStuff();
    }

}
















