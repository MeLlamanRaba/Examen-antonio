package BOLETIN_2;

import java.util.Scanner;

public class E_3 {

    /*Leer números hasta que se introduzca un 0. 
    Para cada uno indicar si es par o impar*/
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        numero = teclado.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es inpar");
            }
            System.out.println("Introduce otro numero: ");
            numero = teclado.nextInt();
        }
    }
}
