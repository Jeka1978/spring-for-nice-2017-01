package qualifiers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import static qualifiers.DBType.DYNAMO_DB;

/**
 * Created by Evegeny on 17/01/2017.
 */
@NiceRepo(DYNAMO_DB)
public class DynamoDbDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving to Dynamo db...");
    }
}
