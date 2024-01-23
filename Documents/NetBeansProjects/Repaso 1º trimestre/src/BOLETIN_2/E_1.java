package BOLETIN_2;

import java.util.Scanner;

public class E_1 {
    /*Leer un número y mostrar su cuadrado, 
    repetir el proceso hasta que se introduzca un número negativo*/

    public static void main(String[] args) {
        int num, cuadrado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca numero: ");
        num = teclado.nextInt();
        while (num >= 0) {
            cuadrado = num * num;
            System.out.println(num + " es igual a " + cuadrado);
            System.out.print("Introduzca otro numero: ");
            num = teclado.nextInt();
        }
    }
}
