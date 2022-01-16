package GUI.Lesson9;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
    
    JFrame frame1 = new JFrame();
    JLabel label1 = new JLabel("Hello");
    

    NewWindow(){

        label1.setBounds(0, 0, 100, 50);
        label1.setFont(new Font(null,Font.PLAIN, 25));

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(420, 420);
        frame1.setVisible(true);
        frame1.setLayout(null);
        frame1.add(label1);
    }
}
