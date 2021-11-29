package GUI.Calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorPractice implements ActionListener {

    JFrame frame;
    JTextField textfield;
    JPanel panel;
    JButton[] funcButtons = new JButton[8];
    JButton[] numButtons = new JButton[10];

    JButton addButton, subButton, mulButton, divButton, equButton, clrButton, delButton, decButton;

    Font myFont = new Font("Ink free", Font.PLAIN, 35);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    CalculatorPractice() {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);

        addButton = new JButton("+"); //1
        subButton = new JButton("-");  //2
        mulButton = new JButton("*"); //3 
        divButton = new JButton("/"); //4
        equButton = new JButton("="); //5 
        clrButton = new JButton("Clear"); //6 
        delButton = new JButton("Delete"); //7
        decButton = new JButton("."); //8

        funcButtons[0] = addButton;
        funcButtons[1] = subButton;
        funcButtons[2] = mulButton;
        funcButtons[3] = divButton;
        funcButtons[4] = equButton;
        funcButtons[5] = clrButton;
        funcButtons[6] = delButton;
        funcButtons[7] = decButton;
   

        for (int i = 0; i < funcButtons.length; i++) {
            funcButtons[i].addActionListener(this);
            funcButtons[i].setFont(myFont);
            funcButtons[i].setFocusable(false);
        }

        for (int i = 0; i < numButtons.length; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
            numButtons[i].setFont(myFont);
            numButtons[i].setFocusable(false);
        }

        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.LIGHT_GRAY);

        // first row

        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(addButton);

        // second row
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(subButton);

        // third row
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(mulButton);

        // fourth row
        panel.add(numButtons[0]);
        panel.add(decButton);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new CalculatorPractice();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numButtons[i]) {
                textfield.setText(textfield.getText() + String.valueOf(i));
            }

        }
        if (e.getSource() == clrButton) {
            textfield.setText("");
        }

        if (e.getSource() == delButton) {
            String s1 = textfield.getText();
            textfield.setText(s1.substring(0, s1.length()-1));
        }

        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
            System.out.println(num1 + " :num1");
        }

        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textfield.getText());
            System.out.println(num2 + ": num2");

            switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                break;

            }
            textfield.setText(String.valueOf(result));
            num1 = result;
        System.out.println(result + " :result");

        }

        

    }

}
