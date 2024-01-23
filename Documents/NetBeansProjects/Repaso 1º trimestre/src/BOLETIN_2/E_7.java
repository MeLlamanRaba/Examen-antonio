package BOLETIN_2;

import java.util.Scanner;

public class E_7 {

    /*Pedir números hasta que se introduzca uno negativo,
    y calcular la media*/
    public static void main(String[] args) {
        int numero, suma, elementos;
        float media;
        suma = 0;
        elementos = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        numero = teclado.nextInt();

        while (numero >= 0) {
            suma += numero; //Duda
            elementos++; //Duda
            System.out.println("Introduzca otro numero: ");
            numero = teclado.nextInt();
        }
        if (elementos == 0) {
            System.out.println("Imposible hacer la media");
        } else {
            media = (float) suma / elementos; //Duda
            System.out.println("La media es de: " + media);
        }
    }
}
