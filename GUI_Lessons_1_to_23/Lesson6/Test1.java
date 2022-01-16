package GUI.Lesson6;

//Flow Layout
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 {
    public static void main(String[] args) {
        
        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(500, 500);
        frame1.setLayout(new FlowLayout(FlowLayout.CENTER, 10 ,10));
        frame1.setVisible(true);

        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(150, 250));
        panel1.setBackground(Color.lightGray);
        panel1.setLayout(new FlowLayout());


        panel1.add(new JButton("1"));
        panel1.add(new JButton("2"));
        panel1.add(new JButton("3"));
        panel1.add(new JButton("4"));
        panel1.add(new JButton("5"));
        panel1.add(new JButton("6"));
        panel1.add(new JButton("7"));
        panel1.add(new JButton("8"));
        panel1.add(new JButton("9"));

        frame1.add(panel1);


    }
}
