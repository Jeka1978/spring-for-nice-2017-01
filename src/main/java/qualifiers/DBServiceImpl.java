package qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static qualifiers.DBType.DYNAMO_DB;
import static qualifiers.DBType.MY_SQL;

/**
 * Created by Evegeny on 17/01/2017.
 */
@Service
public class DBServiceImpl implements DBService {

    @NiceRepo(DYNAMO_DB)
    private Dao danymoDbDao;

    @NiceRepo(MY_SQL)
    private Dao backupDao;


    @Override
    @Scheduled(cron = "1/1 * * * * ?")
    public void doWork(){
        danymoDbDao.save();
    }

    @Override
    @Scheduled(cron = "1/4 * * * * ?")
    public void doBackup(){
        backupDao.save();
    }
}
