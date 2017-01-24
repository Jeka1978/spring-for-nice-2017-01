package profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Evegeny on 24/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("profiles");
    }
}
