package aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 24/01/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Conf.class)
public class SecuredServiceTest {

    @PostConstruct
    public void initTestObect(){
        System.out.println("I'm bean. Yes it's test, bu still I'm a bean");
    }

    @Autowired
    private SecuredService securedService;

    @Test
    public void doWork() throws Exception {
        securedService.doWork();
    }

}