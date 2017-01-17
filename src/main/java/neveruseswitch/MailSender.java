package neveruseswitch;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 17/01/2017.
 */
@Component
public class MailSender {

    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail() {
        int mailCode = DBUtils.getMailCode();
        if (mailCode == 1) {
            //40 lines of code
            System.out.println("sending mail with WELCOME CLIENT");
        }else {
            //50 lines of code
            System.out.println("sending mail with don't call us we call you");
        }
    }
}
