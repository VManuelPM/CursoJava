package com.amoelcodigo.recursividad.ejemplo.exercises;

/**
 * Problem: Write a recursive function to return the nth Fibonacci number.  Input: 6  Expected Output: 8
 */
public class FibonnaciRecursivo {

    public static void main(String[] args) {

        System.out.println(fibonnaci(6));
    }

    public static int fibonnaci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }

}
