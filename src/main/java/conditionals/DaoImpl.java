package conditionals;

import org.springframework.stereotype.Repository;

/**
 * Created by Evegeny on 24/01/2017.
 */
@Repository
@Prod
public class DaoImpl implements Dao {
    @Override
    public void save() {
        System.out.println("SAVING TO PROD");
    }
}
