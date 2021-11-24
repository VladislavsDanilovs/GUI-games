package GUI.Snake.Snakev3;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class GameFrame extends JFrame {

    GameFrame(){
        this.add(new GamePanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}
