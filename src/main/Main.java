package main;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner teclado= new Scanner(System.in);
        System.out.println("HOLA MUNDO");
        System.out.println("INGRESE NOMBRE");
        String nombre= teclado.next();
        System.out.println("EL NOMBRE INGRESADO FUE "+ nombre);

        float largo;
        float ancho;
        float alto;
        float volumen;
        System.out.println("INGRESE VALOR DE LARGO DE LA CAJA");
        largo= teclado.nextFloat();
        System.out.println("INGRESE VALOR DE ANCHO DE LA CAJA");
        ancho= teclado.nextFloat();
        System.out.println("INGRESE VALOR DE ALTO DE LA CAJA");
        alto= teclado.nextFloat();
        volumen= largo*ancho*alto;
        System.out.println("el vulimen de la caja es "+ volumen);
    }
}
