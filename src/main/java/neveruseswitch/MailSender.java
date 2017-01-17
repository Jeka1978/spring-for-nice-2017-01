package neveruseswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evegeny on 17/01/2017.
 */
@Component
public class MailSender {
    @Autowired
    private Map<String,MailGenerator> map;

    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail() {
        String mailCode = String.valueOf(DBUtils.getMailCode());
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new RuntimeException(mailCode + " not supported yet!");
        }
        String body = mailGenerator.generateBody();
        send(body);

    }

    private void send(String body) {
        System.out.println("sending... "+body);
    }


}
