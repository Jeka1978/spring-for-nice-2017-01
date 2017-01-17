package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 17/01/2017.
 */
@Component
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        return "<html> happy bithrday</html>";
    }

    @Override
    public int mailCode() {
        return 3;
    }
}
