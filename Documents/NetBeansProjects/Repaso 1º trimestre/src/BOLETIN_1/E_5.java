package BOLETIN_1;
//Pedir dos números y decir si uno es múltiplo del otro

import java.util.Scanner;

public class E_5 {

    public static void main(String[] args) {
        int numero1, numero2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");

        numero1 = teclado.nextInt();

        System.out.println("Introduce el seggundo numero: ");

        numero2 = teclado.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + "es multiplo de" + numero2);

        } else if (numero2 % numero1 == 0) {
            System.out.println(numero2 + "es multiplo de" + numero1);
        } else {
            System.out.println("No son multiplos entre si");
        }

    }

}
