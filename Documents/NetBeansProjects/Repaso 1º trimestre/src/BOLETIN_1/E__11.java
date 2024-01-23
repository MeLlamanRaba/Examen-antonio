package BOLETIN_1;

import java.util.Scanner;

/**Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
* Suponiendo todos los meses de 30 días*/
public class E__11 {

    public static void main(String[] args) {
        int dia, mes, año;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Introduce el dia: ");
        dia = teclado.nextInt();
        
        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();
        
        System.out.println("Introduce el año: ");
        año = teclado.nextInt();
        
        if (dia >= 1 && dia <= 30) {
            if (mes >=1 && mes <=12)
                if (año >0)
            System.out.println("Fecha correcta");
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
    
}
