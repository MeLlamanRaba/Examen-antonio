package BOLETIN_2;

import java.util.Scanner;

public class E_4 {

    /*Pedir números hasta que se teclee uno negativo, 
    y mostrar cuántos números se han introducido*/
    public static void main(String[] args) {
        int numero, contador;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un numero: ");
        numero = teclado.nextInt();
        
        contador = 1;
         while (numero > 0) {            
            contador = contador + 1;
            
             System.out.println("Introduce de nuevo otro numero: ");
             numero = teclado.nextInt();
        }
        System.out.println("Se han introducido " +contador+ " numeros");
    }

}
