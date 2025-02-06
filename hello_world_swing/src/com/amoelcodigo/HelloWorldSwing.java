package com.amoelcodigo;

import javax.swing.*;

public class HelloWorldSwing {
    public static void main(String[] args) {
        createAndShowWindow();
    }

    public static void createAndShowWindow() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Hola mundo swing");
        JLabel text = new JLabel("Hola Mundo");
        frame.getContentPane().add(text);
        frame.setVisible(true);
        frame.pack();
    }
}
