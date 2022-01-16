package GUI.Lesson7;
//grid layout
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
        frame1.setVisible(true);
        frame1.setLayout(new GridLayout(3,3, 10, 10));

        frame1.add( new JButton("1"));
        frame1.add( new JButton("2"));
        frame1.add( new JButton("3"));
        frame1.add( new JButton("4"));
        frame1.add( new JButton("5"));
        frame1.add( new JButton("6"));
        frame1.add( new JButton("7"));
        frame1.add( new JButton("8"));
        frame1.add( new JButton("9"));
        frame1.add( new JButton("10"));








    }
}
