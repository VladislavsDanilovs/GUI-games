package GUI.Lesson11;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
    JTextField textField1;
    JButton button1;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button1= new JButton("oke oke");
        button1.addActionListener(this);
        textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(250,40));
        textField1.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField1.setForeground(new Color(255, 143, 50));
        textField1.setBackground(Color.black);
        textField1.setCaretColor(Color.white);
        textField1.setText("user:");


        this.add(button1);
        this.add(textField1);
        this.setVisible(true);
        this.pack();
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
           System.out.println("Welcome "+textField1.getText()); 
            button1.setEnabled(false);
            textField1.setEditable(false);
        
        
        }
        
    }
    
}
