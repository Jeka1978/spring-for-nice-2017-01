package screenSaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Evegeny on 17/01/2017.
 */
@Component
public class ColorFrame extends JFrame{
    @Autowired
    private Color color;

    @Autowired
    private Random random;

    @PostConstruct
    public void init() {
        System.out.println(color.getClass());
        setSize(150,150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void moveToRandomLocation() {
        getContentPane().setBackground(color);

        setLocation(random.nextInt(800),random.nextInt(600));
        repaint();

    }



























}
