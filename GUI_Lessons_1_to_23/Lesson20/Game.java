package GUI.Lesson20;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.event.*;

import java.awt.Color;

public class Game {

    JFrame frame1;
    JLabel label1;

    Action upAction; 
    Action downAction; 
    Action leftAction; 
    Action rightAction; 

    Game(){

        frame1 = new JFrame("Keybinding");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(420, 420);
        frame1.setLayout(null);
        frame1.setVisible(true);

        label1 = new JLabel();
        label1.setBackground(Color.red);
        label1.setBounds(100, 100, 100, 100);
        label1.setOpaque(true );

         upAction = new UpAction(); 
        downAction = new DownAction(); 
         leftAction = new LeftAction(); 
         rightAction= new RightAction(); 

        label1.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
        label1.getActionMap().put("upAction", upAction);

        label1.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label1.getActionMap().put("downAction", downAction);

        label1.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label1.getActionMap().put("leftAction", leftAction);

        label1.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label1.getActionMap().put("rightAction", rightAction);

        frame1.add(label1);
    

    }

    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            label1.setLocation(label1.getX(), label1.getY() -10);
        }
        
    }

    
    public class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            label1.setLocation(label1.getX()- 10, label1.getY());

        }
        
    }
    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            label1.setLocation(label1.getX(), label1.getY() +10);

        }
    }

    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            label1.setLocation(label1.getX()+10, label1.getY());

        }
    }
}
