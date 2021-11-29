package GUI.TicTacToe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToePractice implements ActionListener {

    JFrame frame;
    JPanel title_panel;
    JPanel button_panel;
    JLabel textfield;
    JButton[] button = new JButton[9];
    boolean player1_turn;

    TicTacToePractice() {
        frame = new JFrame("Tic tac toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);

        title_panel = new JPanel();
        title_panel.setBounds(0, 0, 800, 100);
        title_panel.setBackground(Color.LIGHT_GRAY);
        title_panel.setLayout(new BorderLayout());

        textfield = new JLabel();
        textfield.setFont(new Font("MV Boli", Font.BOLD, 65));
        textfield.setForeground(Color.BLACK);
        textfield.setBackground(Color.RED);
        textfield.setText("Tic tac toe");
        textfield.setHorizontalAlignment(0);

        title_panel.add(textfield);

        button_panel = new JPanel();
        button_panel.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton();
            button[i].addActionListener(this);
            button[i].setFont(new Font("Ink free", Font.PLAIN, 125));
            button[i].setFocusable(false);
            button_panel.add(button[i]);
        }

        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);

        firstTurn();
    }

    public static void main(String[] args) {
        new TicTacToePractice();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < button.length; i++) {
            if (e.getSource() == button[i]) {
                if (player1_turn) {

                    if (button[i].getText() == "") {
                        button[i].setText("X");
                        player1_turn = false;
                        textfield.setText("O turn");
                        check();
                    }

                } else {
                    if (button[i].getText() == "") {
                        button[i].setText("O");
                        player1_turn = true;
                        textfield.setText("X turn");
                        check();
                    }

                }
            }

        }

    }

    public void firstTurn() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Random r1 = new Random();
        if (r1.nextInt(2) == 0) {
            player1_turn = true;
            textfield.setText("X turn");

        } else {
            player1_turn = false;
            textfield.setText("O turn");
        }
    }

    public void check() {
        //x wins
        if (button[0].getText() == "X" && button[1].getText() == "X" && button[2].getText() == "X") {
            xWins(0, 1, 2);
        }
        if (button[3].getText() == "X" && button[4].getText() == "X" && button[5].getText() == "X") {
            xWins(3, 4, 5);
        }
        if (button[6].getText() == "X" && button[7].getText() == "X" && button[8].getText() == "X") {
            xWins(6, 7, 8);
        }
        if (button[0].getText() == "X" && button[3].getText() == "X" && button[6].getText() == "X") {
            xWins(0, 3, 6);
        }
        if (button[1].getText() == "X" && button[4].getText() == "X" && button[7].getText() == "X") {
            xWins(1, 4, 7);
        }
        if (button[2].getText() == "X" && button[5].getText() == "X" && button[8].getText() == "X") {
            xWins(2, 5, 8);
        }
        if (button[0].getText() == "X" && button[4].getText() == "X" && button[8].getText() == "X") {
            xWins(0, 4, 8);
        }
        if (button[2].getText() == "X" && button[4].getText() == "X" && button[6].getText() == "X") {
            xWins(2, 4, 6);
        }

        // o wins
        if (button[0].getText() == "O" && button[1].getText() == "O" && button[2].getText() == "O") {
            oWins(0, 1, 2);
        }
        if (button[3].getText() == "O" && button[4].getText() == "O" && button[5].getText() == "O") {
            oWins(3, 4, 5);
        }
        if (button[6].getText() == "O" && button[7].getText() == "O" && button[8].getText() == "O") {
            oWins(6, 7, 8);
        }
        if (button[0].getText() == "O" && button[3].getText() == "O" && button[6].getText() == "O") {
            oWins(0, 3, 6);
        }
        if (button[1].getText() == "O" && button[4].getText() == "O" && button[7].getText() == "O") {
            oWins(1, 4, 7);
        }
        if (button[2].getText() == "O" && button[5].getText() == "O" && button[8].getText() == "O") {
            oWins(2, 5, 8);
        }
        if (button[0].getText() == "O" && button[4].getText() == "O" && button[8].getText() == "O") {
            oWins(0, 4, 8);
        }
        if (button[2].getText() == "O" && button[4].getText() == "O" && button[6].getText() == "O") {
            oWins(2, 4, 6);
        }
        tie();
        
   

    }
    public void tie(){
        
        int checkdraw = 0; 

            for(int i =0; i<button.length; i++){
                if(button[i].getText() == "O" || button[i].getText() == "X" ){
                    checkdraw++;
                }
                if(checkdraw == button.length){
                    draw();
                }
            }


        }
     
   
    

    public void xWins(int a, int b, int c) {
        button[a].setBackground(Color.GREEN);
        button[b].setBackground(Color.GREEN);
        button[c].setBackground(Color.GREEN);

        for (int i = 0; i < button.length; i++) {
            button[i].setEnabled(false);
        }
        textfield.setText("X wins, skill diff");

    }

    public void oWins(int a, int b, int c) {
        button[a].setBackground(Color.GREEN);
        button[b].setBackground(Color.GREEN);
        button[c].setBackground(Color.GREEN);

        for (int i = 0; i < button.length; i++) {
            button[i].setEnabled(false);
        }
        textfield.setText("O wins, skill diff");

    
    }

    
    public void draw() {
        for (int i = 0; i < button.length; i++) {
            button[i].setEnabled(false);
        }
        textfield.setText("It's a tie!");
    }

}
