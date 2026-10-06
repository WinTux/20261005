package com.pepito;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + "!");
        //System.out.println("Primer argumento:" + args[0]);
        int suma = 10;
        System.out.println("La suma es: " + suma);
        float division = 10.0f / 3.0f;
        System.out.println("La división es: " + division);
        double potencia = Math.pow(2, 3);
        System.out.println("La potencia es: " + potencia);

        // CASTING
        int numero = 4;
        float numero_float = 34.6f;
        double numero_double =123.78;

        float otro_float = numero;
        double otro_double = numero;
        otro_double = numero_float;

        numero = (int)numero_float;
        numero_float = (float)numero_double;
        System.out.println("El número es: " + numero);
        System.out.println("El número float es: " + numero_float);
        System.out.println("El número double es: " + numero_double);
        System.out.println("El otro número float es: " + otro_float);
        System.out.println("El otro número double es: " + otro_double);
    }
}