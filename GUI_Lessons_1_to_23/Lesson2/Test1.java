package GUI.Lesson2;
//label

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

public class Test1 {
    public static void main(String[] args) {

        ImageIcon img1 = new ImageIcon("shaq1.png");
        Border border1 = BorderFactory.createLineBorder(Color.green, 3);
    

        JLabel label1 = new JLabel();
        label1.setText("Text");
        label1.setIcon(img1);
        label1.setHorizontalTextPosition(JLabel.RIGHT);
        label1.setVerticalTextPosition(JLabel.CENTER);
        label1.setForeground(Color.blue);
        label1.setFont(new Font("MV Boli", Font.PLAIN, 50));

        label1.setIconTextGap(-20);
        label1.setBackground(Color.black);
        label1.setOpaque(true);
        label1.setBorder(border1);
        label1.setVerticalAlignment(JLabel.CENTER); 
        // label1.setBounds(100, 0, 250, 250);

        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame1.setSize(500,500);
        frame1.setVisible(true);
        frame1.add(label1);
        frame1.pack();
        // frame1.setLayout(null);







    }
}
