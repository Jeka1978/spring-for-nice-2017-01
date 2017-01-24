package profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 24/01/2017.
 */
@Service
public class MyService {
    @Autowired
    private Dao dao;

    @PostConstruct
    public void doWork(){
        dao.save();
    }
}
