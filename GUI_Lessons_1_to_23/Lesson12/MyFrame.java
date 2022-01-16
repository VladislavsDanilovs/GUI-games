package GUI.Lesson12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyFrame extends JFrame implements ActionListener {
    
    JButton button1;
    JCheckBox check1;
    ImageIcon icon1;
    ImageIcon icon2;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        icon1 = new ImageIcon("shaq1.png");
        icon2 = new ImageIcon("button1.png");

        button1 = new JButton();
        button1.setText("text1");
        button1.addActionListener(this);

        check1 = new JCheckBox();
        check1.setText("text2");
        check1.setFocusable(false);
        check1.setFont(new Font("Consolas", Font.PLAIN, 35));
        check1.setIcon(icon1);
        check1.setSelectedIcon(icon2);



        this.add(button1);
        this.add(check1);
        this.setVisible(true);
        this.pack();



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
           System.out.println(check1.isSelected()); 
        }        
    }


}
