package profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * Created by Evegeny on 24/01/2017.
 */
@Repository
@Profile("TEST")
//evnironment variable : spring.profiles.active = TEST
public class MockDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving to mock DB");
    }
}
