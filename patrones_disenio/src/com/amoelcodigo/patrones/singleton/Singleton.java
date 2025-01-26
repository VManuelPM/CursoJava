package com.amoelcodigo.patrones.singleton;

public class Singleton {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ConexionBDSingleton conexionBDSingleton = ConexionBDSingleton.getInstancia();
            System.out.println("conexionBDSingleton = " + conexionBDSingleton);
        }
        
        ConexionBDSingleton conexionBDSingleton2 = ConexionBDSingleton.getInstancia();
        ConexionBDSingleton conexionBDSingleton3 = ConexionBDSingleton.getInstancia();
        
        boolean b1 = (conexionBDSingleton2 == conexionBDSingleton3);
        System.out.println("b1 = " + b1);
    }
}
