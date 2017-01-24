package profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * Created by Evegeny on 24/01/2017.
 */
@Repository
@Profile("PROD")
public class RealDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving to prod");
    }
}
