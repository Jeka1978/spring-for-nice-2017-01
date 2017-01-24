package conditionals;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

/**
 * Created by Evegeny on 24/01/2017.
 */
public class OnDevCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String profile = JOptionPane.showInputDialog("what is your profile?");
        return profile.equalsIgnoreCase("DEV");
    }
}
