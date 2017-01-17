package neveruseswitch;

import java.util.Random;

/**
 * Created by Evegeny on 17/01/2017.
 */
public class DBUtils {
    private static Random random = new Random();
    public static int getMailCode() {
        return random.nextInt(3) + 1;
    }
}
