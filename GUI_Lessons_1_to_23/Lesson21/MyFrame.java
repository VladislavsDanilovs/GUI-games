package GUI.Lesson21;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    
    MyPanel panel1;
    MyFrame(){

        panel1 = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(panel1);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }



}
