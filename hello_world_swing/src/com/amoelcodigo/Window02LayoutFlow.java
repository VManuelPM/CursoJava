package com.amoelcodigo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window02LayoutFlow extends JFrame implements ActionListener {

    public Window02LayoutFlow() {
        super("Ejemplo de Boton y eventos");

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 20));

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton("Aceptar".concat(String.valueOf(i)));
            button.addActionListener((event) -> System.out.println("click"));
            button.addActionListener(this);
            button.setSize(100, 50);
            button.setPreferredSize(new Dimension(200, 100));
            panel.add(button);
        }
        setContentPane(panel);
        setSize(600, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Window02LayoutFlow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Boton pulsado!");
    }
}
