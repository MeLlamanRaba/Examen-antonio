package BOLETIN_2;

import java.util.Scanner;

public class E_2 {

    /*Leer un número e indicar si es positivo o negativo. 
    El proceso se repetirá hasta que se introduzca un 0*/
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        numero = teclado.nextInt();

        while (numero != 0) {
            if (numero > 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo ");
            }
            System.out.println("Introduce otro numero: ");
            numero = teclado.nextInt();
        }

    }

}
