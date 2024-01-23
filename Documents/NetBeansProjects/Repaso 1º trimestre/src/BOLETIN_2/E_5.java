package BOLETIN_2;

import java.util.Scanner;

public class E_5 {

    /*Realizar un juego para adivinar un número. 
    Para ello, pedir un número N, y luego ir pidiendo números indicando 
    “mayor” o “menor” según sea mayor o menor con respecto a N. 
    El proceso termina cuando el usuario acierta*/
    public static void main(String[] args) {
        int N, numeros;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Introduce N: ");
        N = teclado.nextInt();
        
        System.out.println("Introduce numeros: ");
        numeros = teclado.nextInt();
        
        while (N != numeros) {            
            
        }
        
    }

}
