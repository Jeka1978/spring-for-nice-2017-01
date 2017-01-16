package quoters;

import lombok.Setter;

/**
 * Created by Evegeny on 16/01/2017.
 */
@Setter
public class ShakespearQuoter implements Quoter {

    @InjectRandomInt(min = 3, max = 7)
    private int repeat;
    private String message;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
