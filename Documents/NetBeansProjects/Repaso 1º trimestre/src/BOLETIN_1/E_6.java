package BOLETIN_1;
//Pedir dos números y decir cuál es el mayor

import java.util.Scanner;

public class E_6 {

    public static void main(String[] args) {
        int numero1, numero2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
        
        numero1 = teclado.nextInt();
        
        System.out.println("Introduce el segundo numero:");
        
        numero2 = teclado.nextInt();
        
        if (numero1 > numero2) {
            System.out.println(numero1+ " es mayor que "+ numero2);
            
        } else if (numero2 > numero1){
            System.out.println(numero2 + " es mayor que "+ numero1);
        } 
        else {
            System.out.println("Los numeros son iguales");
        }

    }

}
