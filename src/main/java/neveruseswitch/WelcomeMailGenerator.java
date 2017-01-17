package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 17/01/2017.
 */
@Component
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        // 50 lines of code
        return "<html> WELCOME client! </html>";
    }

    @Override
    public int mailCode() {
        return 1;
    }
}
