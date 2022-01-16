package GUI.Lesson1;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Test1 {
    public static void main(String[] args) {
        
         JFrame frame1 = new JFrame();
         frame1.setTitle("Jframe title goes here");
         frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame1.setResizable(false);
         frame1.setSize(420, 420);
         frame1.setVisible(true);
        
         ImageIcon img1 = new ImageIcon("shaq1.png");
         frame1.setIconImage(img1.getImage());

         frame1.getContentPane().setBackground(new Color(123,50,250));
        MyFrame myfr1 = new MyFrame();
    }
}
