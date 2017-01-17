package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 17/01/2017.
 */
@Component("1")
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        // 50 lines of code
        return "<html> WELCOME client! </html>";
    }
}
