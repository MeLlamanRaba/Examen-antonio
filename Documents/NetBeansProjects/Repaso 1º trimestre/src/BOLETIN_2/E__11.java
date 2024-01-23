package BOLETIN_2;
public class E__11 {

    //Diseñar un programa que muestre el producto de los 10 primeros números impares
    public static void main(String[] args) {
        int producto;
        producto=1;
        for (int i = 1; i < 20; i+=2) {
            producto = producto * i;
        }
        System.out.println("El producto de los 10 primero numeros impares es: "+ producto);
    }
    
}
