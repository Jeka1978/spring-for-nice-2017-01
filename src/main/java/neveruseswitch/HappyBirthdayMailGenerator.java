package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 17/01/2017.
 */
@Component("3")
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        return "<html> happy bithrday</html>";
    }
}
