package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 16/01/2017.
 */
@Setter
@Component
@Book
public class ShakespearQuoter implements Quoter {

    @InjectRandomInt(min = 3, max = 7)
    private int repeat;


    @Value("${shake}")
    private String message;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
