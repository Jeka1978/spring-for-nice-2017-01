package neveruseswitch;

import java.util.Random;

/**
 * Created by Evegeny on 17/01/2017.
 */
public class DBUtils {
    public static int getMailCode() {
        Random random = new Random();
        return random.nextInt(2)+1;
    }
}
