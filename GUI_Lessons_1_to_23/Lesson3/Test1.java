package GUI.Lesson3;

//panels

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Font;

public class Test1 {
    public static void main(String[] args) {
        
        ImageIcon icon1 = new ImageIcon("shaq1.png");

        JLabel label1 = new JLabel();
        label1.setText("Hi");
        label1.setIcon(icon1);
        label1.setVerticalAlignment(JLabel.BOTTOM);
        label1.setHorizontalAlignment(JLabel.RIGHT);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0,250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0,250, 250);

        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250,500, 250);
        greenPanel.setLayout(new BorderLayout());


        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        frame1.setSize(750,750);
        frame1.setVisible(true);
        greenPanel.add(label1);
        frame1.add(redPanel);
        frame1.add(bluePanel);
        frame1.add(greenPanel);

 


    }
}
