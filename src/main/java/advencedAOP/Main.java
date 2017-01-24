package advencedAOP;

import advencedAOP.business.DBService;
import advencedAOP.conf.MyConf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Evegeny on 24/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);
        DBService dbService = context.getBean(DBService.class);
        try {
            dbService.doWork();
        } catch (Exception e) {
            System.out.println("ERROR....");
        }
    }
}
