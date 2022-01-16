package GUI.Lesson19;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label1;
    ImageIcon img1 = new ImageIcon("shaq1.png");

    

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
    
        label1 = new JLabel();
        label1.setBounds(0, 0 , 100, 100);
        label1.setBackground(Color.red);
        label1.setOpaque(true);
        label1.addMouseListener(this);

        this.add(label1);
    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        // System.out.println("You clicked mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You pressed mouse");
        label1.setBackground(Color.yellow);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You released mouse");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exited");

        // TODO Auto-generated method stub
        
    }
}
