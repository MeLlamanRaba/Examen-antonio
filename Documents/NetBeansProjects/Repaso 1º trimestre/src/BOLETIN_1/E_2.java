package BOLETIN_1;
//Pedir el radio de un círculo y calcular su área. [A=PI*r^2]

import java.util.Scanner;
public class E_2 {
public static void main(String[] args) {
    double radio, area;
    
    System.out.println("Introduce el radio: ");
    
    Scanner teclado = new Scanner (System.in);
    
    radio = teclado.nextInt();
    
    area = Math.PI * Math.pow(radio, 2);
    
    System.out.println("El area es: "+ area);
    }
}