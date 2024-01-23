package BOLETIN_1;
//Pedir dos números y decir si son iguales o no

import java.util.Scanner;

public class E_3 {

    public static void main(String[] args) {
        int numero1, numero2;

        System.out.println("Introduzca el primer numero: ");

        Scanner teclado = new Scanner(System.in);

        numero1 = teclado.nextInt();

        System.out.println("Introduzca el segundo numero: ");

        numero2 = teclado.nextInt();

        if (numero1 == numero2) { //Diferencia entre == y =

            System.out.println("Los numeros son iguales");

        } else {

            System.out.println("Los numeros no son iguales");
        }

    }

}
