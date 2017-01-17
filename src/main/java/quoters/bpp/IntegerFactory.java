package quoters.bpp;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.FactoryBean;

import java.util.Random;

/**
 * Created by Evegeny on 17/01/2017.
 */
@AllArgsConstructor
public class IntegerFactory  {
    private int max;

    public int getRandomInt() {
        return new Random().nextInt(max);
    }
}
