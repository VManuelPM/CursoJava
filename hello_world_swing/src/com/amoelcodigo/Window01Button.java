package com.amoelcodigo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window01Button extends JFrame implements ActionListener {

    public Window01Button(){
        super("Ejemplo de Boton y eventos");

        JButton button = new JButton("Aceptar");
        button.setSize(100, 50);
        getContentPane().add(button);
        setSize(200, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Window01Button();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Boton pulsado!");
    }
}
