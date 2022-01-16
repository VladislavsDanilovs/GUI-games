package GUI.Lesson22;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;

    Image shaq1;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 4;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel(){

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.blue);
        shaq1 = new ImageIcon("shaq1.png").getImage();
        backgroundImage = new ImageIcon("background.jpg").getImage();
        timer = new Timer(10, this);
        timer.start();

    }

    public void paint(Graphics g) {


        super.paint(g); // paint background

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(shaq1, x, y, null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>= PANEL_WIDTH - shaq1.getWidth(null) || x< 0) {
            xVelocity = xVelocity * -1 ;
        }
        x = x + xVelocity;
    

        if(y>= PANEL_HEIGHT - shaq1.getHeight(null) || y< 0) {
            yVelocity = yVelocity * -1 ;
        }
        y = y + xVelocity;
        repaint();
    }
    
}
