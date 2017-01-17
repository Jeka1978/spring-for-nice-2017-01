package neveruseswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Evegeny on 17/01/2017.
 */
@Component
public class MailSender {

    private Map<Integer,MailGenerator> map = new HashMap<>();

    @Autowired
    private void configureMap(List<MailGenerator> mailGenerators) {
        for (MailGenerator mailGenerator : mailGenerators) {
            int key = mailGenerator.mailCode();
            if (map.containsKey(key)) {
                throw new RuntimeException("mailcode already in use");
            }
            map.put(key, mailGenerator);
        }
    }

    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail() {
        int mailCode = DBUtils.getMailCode();
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
