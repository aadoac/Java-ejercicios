package org.ejercios;

import java.util.Scanner;

/**
 * Dado un numero, indicar si es par o impar.
 */
public class Ej5 {
    public static boolean esPar(int n) {
        //TODO Implementar codigo

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n = scanner.nextInt();
        if (esPar(n))
            System.out.println("El numero " + n + " es par");
        else  System.out.println("El numero " + n + " es impar");

    }
}
