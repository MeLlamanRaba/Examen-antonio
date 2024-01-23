package BOLETIN_2;

import java.util.Scanner;

public class E__10 {

    //Pedir 15 números y escribir la suma total
    public static void main(String[] args) {
        int numero, suma;
        suma= 0;
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 1; i <= 15; i++) {
            System.out.println("Introduce un numero: ");
            numero = teclado.nextInt();
            suma = suma + numero;
        }
        System.out.println("La suma total es:"+ suma);
    }
}
