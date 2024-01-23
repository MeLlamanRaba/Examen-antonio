package BOLETIN_1;
//Pedir dos números y mostrarlos ordenados de mayor a menor

import java.util.Scanner;

public class E_7 {

    public static void main(String[] args) {
        int numero1, numero2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");

        numero1 = teclado.nextInt();

        System.out.println("Introduce el segundo numero:");

        numero2 = teclado.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " > " + numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " > " + numero1);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }

}
