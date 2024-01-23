package BOLETIN_2;

import java.util.Scanner;

public class E_8 {

    //Pedir un número N, y mostrar todos los números del 1 al N.
    public static void main(String[] args) {
        int N, suma;
        suma = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        N = teclado.nextInt();

        while (suma <= N) {
            System.out.println(suma);
            suma++;
        }

    }

}
