package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 17/01/2017.
 */
@Component
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        // 80 lines of code
        return "<html> don't call us we call you </html>";
    }

    @Override
    public int mailCode() {
        return 2;
    }
}
