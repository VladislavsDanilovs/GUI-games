package GUI.Lesson4;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame implements ActionListener {
    
    JButton button1;
    JLabel label1;

    MyFrame(){
        label1 = new JLabel();
        ImageIcon img1 = new ImageIcon("shaq1.png");
        ImageIcon img2 = new ImageIcon("shaq1.png");
        label1.setIcon(img2);
        label1.setBounds(150, 250, 150, 150);
        label1.setVisible(false);


        button1 = new JButton();
        button1.setBounds(100, 100, 250, 100);
        button1.addActionListener(this);
        button1.setText("Button");
        button1.setIcon(img1);
        button1.setHorizontalTextPosition(JButton.CENTER
        );
        button1.setVerticalTextPosition(JButton.BOTTOM);
        button1.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button1.setIconTextGap(-15);
        button1.setForeground(Color.cyan);
        button1.setBackground(Color.lightGray);
        button1.setBorder(BorderFactory.createEtchedBorder());
     

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
        this.add(button1);
        this.add(label1);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button1){
           System.out.println("Khjau");
           button1.setEnabled(false);
           label1.setVisible(true);
       }
    }

}
