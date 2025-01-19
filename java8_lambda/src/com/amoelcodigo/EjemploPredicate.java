package com.amoelcodigo;

import com.amoelcodigo.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        //Predicate siempre retorna boolean
        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(7);
        System.out.println("r = " + r);


        Predicate<String> test2 = role -> role.equals("admin");
        System.out.println(test2.test("admin"));

        BiPredicate<String, String> test3 = String::equalsIgnoreCase;
        System.out.println("test3.test() = " + test3.test("manu", "alicia"));
        
        BiPredicate<Integer, Integer> test4 = (i,j) -> j > i;
        boolean r2 = test4.test(5,10);
        System.out.println("r2 = " + r2);

        Usuario a = new Usuario();
        Usuario b = new Usuario();

        a.setName("Alicia");
        b.setName("Maria");

        BiPredicate<Usuario, Usuario> test5 = (ua, ub) -> ua.getName().equals(ub.getName());
        System.out.println("test5 = " + test5.test(a,b));
    }
}
