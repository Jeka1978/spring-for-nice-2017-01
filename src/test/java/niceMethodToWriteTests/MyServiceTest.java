package niceMethodToWriteTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 24/01/2017.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MockConfig.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)  in case you need to rebuild context everytime
public class MyServiceTest {
    @Autowired
    @Real
    MyService myService;

    @Test
    public void doWork() throws Exception {
        myService.doWork();
    }

}