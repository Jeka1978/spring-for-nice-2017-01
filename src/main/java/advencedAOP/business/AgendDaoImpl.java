package advencedAOP.business;

import org.springframework.stereotype.Repository;

/**
 * Created by Evegeny on 24/01/2017.
 */
@Repository
public class AgendDaoImpl implements AgendDao {
    @Override
    public void save() {
        System.out.println("Saving....");
        throw new DBException("sql database was lost, try to use Mongo");
    }
}
