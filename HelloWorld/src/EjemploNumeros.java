import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EjemploNumeros {
    public static void main(String[] args) {
        nameFunction();
    }

    public void numerosOrdenados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        float n1 = scanner.nextFloat();

        System.out.println("Ingrese el segundo número");
        float n2 = scanner.nextFloat();

        System.out.println("números Ordenados " + (n1>n2 ? (n1 + " , " + n2 ) : (n2 + " , " + n1 )));
    }

    public void gasolina(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la medida");
        float medida = scanner.nextFloat();

        if(medida == 70){
            System.out.println("Estanque Lleno");
        }
        else if(medida==60 || medida<70){
            System.out.println("Estanque casi lleno");
        }
    }

    public static void nameFunction(){
        String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");

        String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;

        System.out.println("La persona con el nombre mas largo es " + max);
    }
}
