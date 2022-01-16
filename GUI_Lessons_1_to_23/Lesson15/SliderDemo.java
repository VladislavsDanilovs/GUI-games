package GUI.Lesson15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener {

    JFrame frame1;
    JPanel panel1;
    JLabel label1;
    JSlider slider1;

    SliderDemo(){

        frame1 = new JFrame("Slider demo");
        panel1 = new JPanel();
        label1 = new JLabel();
        slider1 = new JSlider(0 , 100, 50);

        slider1.setPreferredSize(new Dimension(400, 200));

        slider1.setPaintTicks(true);
        slider1.setMinorTickSpacing(10);

        slider1.setPaintTrack(true);
        slider1.setMajorTickSpacing(25);

        slider1.setPaintLabels(true);
        slider1.setFont(new Font("MV Boli", Font.PLAIN, 15));
        slider1.setOrientation(SwingConstants.VERTICAL);
        label1.setText("Celcius ="+slider1.getValue());

        slider1.addChangeListener(this);
        panel1.add(slider1);
        panel1.add(label1);
        frame1.add(panel1);
        frame1.setSize(420, 420);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        label1.setText("Celcius ="+slider1.getValue());

    }
    
}
