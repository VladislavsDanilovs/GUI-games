package GUI.Lesson1;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
 
    MyFrame(){
        
        this.setTitle("Jframe title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420);  
        this.setVisible(true);
        
        ImageIcon img1 = new ImageIcon("shaq1.png");
        this.setIconImage(img1.getImage());
        this.getContentPane().setBackground(new Color(123,50,250));

    }


}
