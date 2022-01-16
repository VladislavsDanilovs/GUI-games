package GUI.Lesson14;
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
import javax.swing.JComboBox;
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

    JComboBox combo1;

    ImageIcon img1;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        String[] animals = {"Dog", "Cat", "Bird"};

        combo1 = new JComboBox(animals);
       combo1.addActionListener(this);

    //    combo1.setEditable(true);
    //    combo1.getItemCount();
            // combo1.addItem("Horse");
            // combo1.insertItemAt("Bull", 0);
            // combo1.setSelectedIndex(0);
            // combo1.removeItem("Bull");
            // combo1.removeItemAt(0);
            // combo1.removeAllItems();

       this.add(combo1);
        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == combo1) {
    // System.out.println(combo1.getSelectedItem());
            System.out.println(combo1.getSelectedIndex());

}
    }
    
}
