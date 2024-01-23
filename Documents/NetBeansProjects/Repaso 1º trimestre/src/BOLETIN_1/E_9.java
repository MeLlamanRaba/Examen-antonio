package BOLETIN_1;

import java.util.Scanner;

/**Pedir un número entre 0 y 9999 y decir cuántas cifras tiene:
Por ejemplo:
9 -> tiene una cifra
19 -> tiene dos cifras
365 -> tiene tres cifras**/
public class E_9 {
    public static void main(String[] args) {
        int numero;
        
        Scanner teclado = new Scanner(System.in);      
        System.out.println("Ingresa un numero del 0-9999: ");
        numero = teclado.nextInt();
        
        if (numero < 0 || numero > 9999) {
            System.out.println("El numero no es correcto");
            
        } else if (numero < 10){
            System.out.println(numero + "-> tiene una cifra");
        
        } else if (numero < 100) {
            System.out.println(numero + "-> tiene dos cifras");
            
        } else if (numero < 1000) {
            System.out.println(numero + "-> tiene tres cifras");
            
        } else if (numero < 10000){
            System.out.println(numero + "-> tiene cuatro cifras");
        }
        
    }
    
}
