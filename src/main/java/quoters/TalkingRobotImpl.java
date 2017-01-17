package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Evegeny on 16/01/2017.
 */

@Setter
@Component
public class TalkingRobotImpl implements TalkingRobot {
    @Autowired
    private List<Quoter> quoters;
    @Override
    @PostConstruct
    public void talk() {
       quoters.forEach(Quoter::sayQuote);
    }
}
