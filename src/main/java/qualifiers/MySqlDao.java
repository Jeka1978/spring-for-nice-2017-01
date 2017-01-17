package qualifiers;

import static qualifiers.DBType.MY_SQL;

/**
 * Created by Evegeny on 17/01/2017.
 */
@NiceRepo(MY_SQL)
public class MySqlDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving to mySQL...");
    }
}
