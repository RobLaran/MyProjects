package Interface.Drawable;

import java.awt.*;
import javax.swing.*;

public class Triangle implements Drawable{
    
    public void draw(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        JPanel panel = new JPanel(){

            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.GREEN);
                int[] x = {100, 200, 300};
                int[] y = {250, 50, 250};
                g.fillPolygon(x, y, 3);
            }
        };

        frame.add(panel);
    }

}
