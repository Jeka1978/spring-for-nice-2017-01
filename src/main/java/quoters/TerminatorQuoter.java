package quoters;


import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 16/01/2017.
 */
//@Setter
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Film
@Order(2)
//@DependsOn("shakespearQuoter")
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String[] messages) {
        this.messages = new ArrayList<>(Arrays.asList(messages));
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    @PreDestroy
    public void killAll(){
        System.out.println("you are terminated");
    }
}
