package GUI.Lesson8;
//Layered pane
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;


public class Test1 {
    public static void main(String[] args) {
        

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.blue);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.magenta);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane layeredPane1 = new JLayeredPane(); 
        layeredPane1.setBounds(0, 0, 500, 500);

        layeredPane1.add(label1, Integer.valueOf(0));
        layeredPane1.add(label2, Integer.valueOf(2));
        layeredPane1.add(label3, Integer.valueOf(1));

        JFrame frame1 = new JFrame("JLayeredPane");
        frame1.add(layeredPane1);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(new Dimension(500, 500));
        frame1.setLayout(null);
        frame1.setVisible(true);





    }
}
