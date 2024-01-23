package BOLETIN_2;

import java.util.Scanner;

public class E_6 {

    /*Pedir números hasta que se teclee un 0, 
    mostrar la suma de todos los números introducidos*/
    public static void main(String[] args) {
        int numero, suma;
        suma = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Introduce un numero: ");
            numero = teclado.nextInt();

            suma = suma + numero;

        } while (numero != 0);

        System.out.println("La suma de los numeros es: " + suma);
    }

}
