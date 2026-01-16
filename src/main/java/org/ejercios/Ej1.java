package org.ejercios;

import java.util.Scanner;

/**
 * Comprueba que un string empieza por ca.
 */
public class Ej1 {

    public static boolean comprobarString(String s) {
        // TODO Implementar codigo
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String str = scanner.nextLine();
        if (comprobarString(str)) {
            System.out.println("La palabra " + str + " empieza por ca");
        } else {
            System.out.println("La palabra " + str + " no empieza por ca");
        }
    }
}
