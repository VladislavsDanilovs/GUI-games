package GUI.Lesson9;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
    
    JFrame frame1 = new JFrame();
    JButton myButton1 = new  JButton("New window");

    LaunchPage(){

        myButton1.setBounds(100, 100, 200, 100);
        myButton1.setFocusable(false);
        myButton1.addActionListener(this);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(420, 420);
        frame1.setVisible(true);
        frame1.setLayout(null);
        frame1.add(myButton1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == myButton1) {
                frame1.dispose(); //to close our current frame when we will press button
                NewWindow myWindow1 = new NewWindow();
            }
    }
}
