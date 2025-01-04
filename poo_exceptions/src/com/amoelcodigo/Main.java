package com.amoelcodigo;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        String valor = JOptionPane.showInputDialog("Ingrese un entero: ");
        int divisor;
        double division;

        try {
            //divisor = Integer.parseInt(valor);
           // division = calculadora.dividir(10, divisor);
            //System.out.println(division);

            double division2 = calculadora.dividir("10", "r");
            System.out.println("division2 = " + division2);
        } catch (NumberFormatException nfe) {
            System.out.println("Se detecto una excepción: Por favor ingrese un valor númerico " + nfe.getMessage());
        }catch (FormatoNumeroException fne){
            System.out.println("Se detecto una excepción: Por favor ingrese un número valido " + fne.getMessage() );
            fne.printStackTrace(System.out);
        }
        catch (DivisionPorCeroException ae) {
            System.out.println("Capturamos la excepción en tiempo de ejecución: " + ae.getMessage());
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con excepción o sin");
        }

        System.out.println("Continua la ejecución");

    }
}