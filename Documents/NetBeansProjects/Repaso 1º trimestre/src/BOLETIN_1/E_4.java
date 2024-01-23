package BOLETIN_1;
//Pedir un número e indicar si es positivo o negativo.

import java.util.Scanner;

public class E_4 {

    public static void main(String[] args) {
        int numero;
        System.out.println("Introduce un numero: ");

        Scanner teclado = new Scanner(System.in);

        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero no es par");
        }

    }

}
