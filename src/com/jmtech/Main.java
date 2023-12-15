package com.jmtech;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame {
    JTextField textField1, textField2;
    JButton button1, button2, button3, button4;
    JLabel label1, label2, label3, label4, label5, label6, label7;

    Calculator() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setTitle("Simple Calc");

        label1 = new JLabel("Simple Calculator");
        label1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        label1.setForeground(Color.BLACK);
        label1.setBounds(60, 10, 300, 30);
        add(label1);

        label2 = new JLabel("Enter first number: ");
        label2.setBounds(20, 50, 130, 30);
        add(label2);


        label3 = new JLabel("Enter second number: ");
        label3.setBounds(20, 90, 130, 30);
        add(label3);

        textField1 = new JTextField(60);
        textField1.setBounds(160, 50, 120, 30);
        add(textField1);

        textField2 = new JTextField(60);
        textField2.setBounds(160, 90, 120, 30);
        add(textField2);

        button1 = new JButton("Add");
        button1.setBounds(20, 130, 100, 30);
        button1.setFocusable(false);
        add(button1);

        button2 = new JButton("Subtract");
        button2.setBounds(20, 170, 100, 30);
        button2.setFocusable(false);
        add(button2);

        button3 = new JButton("Multiply");
        button3.setBounds(20, 210, 100, 30);
        button3.setFocusable(false);
        add(button3);

        button4 = new JButton("Divide");
        button4.setBounds(20, 250, 100, 30);
        button4.setFocusable(false);
        add(button4);

        label4 = new JLabel();
        label4.setBounds(130, 130, 100, 30);
        add(label4);
        label5 = new JLabel();
        label5.setBounds(130, 170, 100, 30);
        add(label5);
        label6 = new JLabel();
        label6.setBounds(130, 210, 100, 30);
        add(label6);
        label7 = new JLabel();
        label7.setBounds(130, 250, 100, 30);
        add(label7);

        // Here I am adding functionalities to these several buttons
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                label4.setText("" + (num1+num2));
            }
        });

        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                label5.setText("" + (num1-num2));
            }
        });

        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                label6.setText("" + (num1*num2));
            }
        });

        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1= Integer.parseInt(textField1.getText());
                int num2= Integer.parseInt(textField2.getText());
                double quotient = (double)num1/num2;
                label7.setText(String.format("%.4f",quotient));
            }
        });

    }
}

public class Main {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.setBounds(400,250,400,350);
    }
}
