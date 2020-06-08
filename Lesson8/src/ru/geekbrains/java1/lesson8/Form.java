package ru.geekbrains.java1.lesson8;

import javax.swing.*;
import java.awt.*;


public class Form extends JFrame {
    public Form() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLayout(new GridLayout(5, 3));

        JTextField jtf = new JTextField("Result...");
        add(jtf);

        char[] chars = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '+', '-', '*', '/', '='};
        for (int i = 0; i < chars.length; i++) {
            JButton jb = new JButton(String.valueOf(chars[i]));
            jb.addActionListener(new ButtonListener(jtf));
            add(jb);
        }
        setVisible(true);
    }
}

