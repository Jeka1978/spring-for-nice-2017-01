package conditionals;

import org.springframework.stereotype.Repository;

/**
 * Created by Evegeny on 24/01/2017.
 */
//@Repository
//@Dev
public class MockDao implements Dao {
    @Override
    public void save() {
        System.out.println("SAVING TO MOCK DB");
    }
}
