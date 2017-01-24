package advencedAOP.business;

/**
 * Created by Evegeny on 24/01/2017.
 */
public class DBException extends RuntimeException {
    public DBException(String message) {
        super(message);
    }
}
