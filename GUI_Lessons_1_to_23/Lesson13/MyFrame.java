package GUI.Lesson13;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
    JTextField textField1;
    JButton button1;
    JRadioButton pizza1;
    JRadioButton hamburger1;
    JRadioButton hotdog1;

    ImageIcon img1;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

     pizza1 = new JRadioButton("pizza");
     hamburger1 = new JRadioButton("burger");
     hotdog1 = new JRadioButton("hotdog");

        img1 = new ImageIcon("shaq1.png");
        ButtonGroup group1 = new ButtonGroup();
        group1.add(pizza1);
        group1.add(hamburger1);
        group1.add(hotdog1);

        pizza1.addActionListener(this);
        hotdog1.addActionListener(this);
        hamburger1.addActionListener(this);

        pizza1.setIcon(img1);
        this.add(pizza1);
        this.add(hamburger1);
        this.add(hotdog1);
        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizza1) {
            System.out.println("Your ordered pizza!");
        } else if(e.getSource()==hamburger1){
            System.out.println("Your ordered a burger!");

        } else if(e.getSource()==hotdog1){
            System.out.println("Your ordered a hotdog!");

        }
        
    }
    
}
