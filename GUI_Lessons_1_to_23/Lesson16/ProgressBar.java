package GUI.Lesson16;

import java.awt.*;
import javax.swing.*;

public class ProgressBar {
    
    
    JFrame frame1 = new JFrame();
    JProgressBar bar1 = new JProgressBar(0, 500);

    ProgressBar(){
        
        bar1.setValue(0);
        bar1.setBounds(0, 0, 420, 50);
        bar1.setStringPainted(true);
        bar1.setFont(new Font("MV Boli", Font.BOLD, 35));
        bar1.setForeground(Color.red);
        bar1.setBackground(Color.black);

        frame1.add(bar1);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(420, 420);
        frame1.setLayout(null);
        frame1.setVisible(true);
        
        fill();
    
    
    }
    
    public void fill(){

        int counter = 500;

        while (counter>=0) {

            bar1.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            counter -=1;
        }
            bar1.setString("Done!");


    }
}
