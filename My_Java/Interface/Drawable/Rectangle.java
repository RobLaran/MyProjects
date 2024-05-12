package Interface.Drawable;

import java.awt.*;
import javax.swing.*;

public class Rectangle implements Drawable{

    public void draw(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillRect(50, 100, 300, 150);
            }
        };

        frame.add(panel);

    }
}
