package conditionals;/**
 * Created by Evegeny on 24/01/2017.
 */

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Conditional(OnDevCondition.class)
public @interface Dev {
}
