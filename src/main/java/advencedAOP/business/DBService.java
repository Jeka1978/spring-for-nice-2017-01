package advencedAOP.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 24/01/2017.
 */
@Service
public class DBService {
    @Autowired
    private AgendDao agendDao;

    public void doWork(){
        agendDao.save();
    }
}
