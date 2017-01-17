package screenSaver;

import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

/**
 * Created by Evegeny on 17/01/2017.
 */
@Configuration
@ComponentScan(basePackages = "screenSaver")
public class ScreenSaverConfig {

    @Bean
    public Random random(){
        return new Random();
    }

    @Bean
    @Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color color(){
        Random random = random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }
}








