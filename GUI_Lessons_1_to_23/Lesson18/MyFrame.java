package GUI.Lesson18;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label1;
    ImageIcon img1 = new ImageIcon("shaq1.png");

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label1 = new JLabel();
        label1.setBounds(0, 0, 250, 250);
        label1.setBackground(Color.blue);
        label1.setOpaque(true);
        label1.setIcon(img1);

        this.add(label1);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        switch (e.getKeyChar()) {
        case 'a':
            label1.setLocation(label1.getX() - 5, label1.getY());
            break;
        case 'd':
            label1.setLocation(label1.getX() + 5, label1.getY());
            break;
        case 's':
            label1.setLocation(label1.getX(), label1.getY()+5);
            break;
        case 'w':
            label1.setLocation(label1.getX(), label1.getY()-5);
            break;

        default:
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        switch (e.getKeyCode()) {
            case 39:
                label1.setLocation(label1.getX() - 5, label1.getY());
                break;
            case 37:
                label1.setLocation(label1.getX() + 5, label1.getY());
                break;
            case 40:
                label1.setLocation(label1.getX(), label1.getY()+5);
                break;
            case 38:
                label1.setLocation(label1.getX(), label1.getY()-5);
                break;
    
            default:
                break;
            }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You release key char: " + e.getKeyChar());
        System.out.println("You release key code: " + e.getKeyCode());
    }
}
