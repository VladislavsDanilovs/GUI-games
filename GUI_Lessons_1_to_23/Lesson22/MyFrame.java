package GUI.Lesson22;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    
    MyPanel panel1;
    MyFrame(){

        panel1 = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel1);
        this.pack();
        this.setLocationRelativeTo(null); //allow to frame to appear in the middle of screen
        this.setVisible(true);

    }



}
