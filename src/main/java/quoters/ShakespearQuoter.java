package quoters;

import lombok.Setter;

/**
 * Created by Evegeny on 16/01/2017.
 */
@Setter
public class ShakespearQuoter implements Quoter {
    private String message;

    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
