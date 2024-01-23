package BOLETIN_1;
//Pedir tres números y mostrarlos ordenados de mayor a menor

import java.util.Scanner;

public class E_8 {

    public static void main(String[] args) {
        int numero1, numero2, numero3;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el primer numero: ");
        numero1 = teclado.nextInt();

        System.out.println("Introduzca el segundo numero: ");
        numero2 = teclado.nextInt();

        System.out.println("Introduzca el tercer numero: ");
        numero3 = teclado.nextInt(); //1>2>3

        if (numero1 > numero2 && numero2 > numero3) {
            System.out.println(numero1 + ", " + numero2 + ", " + numero3);

        } else if (numero1 > numero3 && numero3 > numero2) {
            System.out.println(numero1 + ", " + numero3 + ", " + numero2);

        } else if (numero2 > numero1 && numero1 > numero3) {
            System.out.println(numero2 + ", " + numero1 + ", " + numero3);
            
        } else if (numero2 > numero3 && numero3 > numero1) {
            System.out.println(numero2 + ", " + numero3 + ", " + numero1);
            
        } else if (numero3 > numero1 && numero1 > numero2) {
            System.out.println(numero3 + ", " + numero1 + ", " + numero2);
            
        } else if (numero3 > numero2 && numero2 > numero1) {
            System.out.println(numero3 + ", " + numero2 + ", " + numero1);
        }
    }
}
