package conditionals;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;
import java.util.Random;

/**
 * Created by Evegeny on 24/01/2017.
 */
public class OnProdCondition implements Condition {
    private Random random = new Random();
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
//        String profile = JOptionPane.showInputDialog("what is your profile?");
        String profile = "prod";
        System.out.println("11111111111111111111111111111111111111111111");
//        return profile.equalsIgnoreCase("PROD");
        return random.nextInt(2)==1;
    }
}
