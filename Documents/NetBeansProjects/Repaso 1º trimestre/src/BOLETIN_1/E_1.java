package BOLETIN_1;

import java.util.Scanner;

public class E_1 {

    public static void main(String[] args) {
        double a, b, c;
        double x1, x2, d;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el primer coeficiente (a):");
        a = teclado.nextDouble();
        System.out.println("Introduzca el segundo coeficiente (b):");
        b = teclado.nextDouble();
        System.out.println("Introduzca el tercer coeficiente (c):");
        c = teclado.nextDouble();

        d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            System.out.println("No existen soluciones reales");

        } else {
            x1 = (-b + Math.sqrt(d) / (2 * a));
            x2 = (-b - Math.sqrt(d) / (2 * a));
            System.out.println("Solucion:" + x1);
            System.out.println("Solucion:" + x2);
        }
    }

}
