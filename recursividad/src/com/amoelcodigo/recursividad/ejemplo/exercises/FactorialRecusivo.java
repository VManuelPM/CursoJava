package com.amoelcodigo.recursividad.ejemplo.exercises;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/*
Problem: Write a recursive function to calculate the factorial of a number.  Input: 5  Expected Output: 120
 */
public class FactorialRecusivo {

    public static void main(String[] args) {
        factorial(5);
    }


    //Not recursivity but with stream
   // public static void factorial(int n) {
//     Integer resultado = Stream.iterate(1, i -> i + 1)
//             .limit(n)
//             .reduce(1, (a, b) -> a * b);

//     System.out.println("El factorial de " + n + " es " + resultado);
// }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }


}
