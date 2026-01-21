package org.ejercios;

import java.util.Scanner;

/**
 * Dado dos numeros diferentes, devolver el numero mayor
 */
public class Ej4 {
    public static int devolverNumeroMayor(int n, int m) {
        //TODO Implementar codigo

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n = scanner.nextInt();
        System.out.println("Introduce otro numero");
        int m = scanner.nextInt();
        int numeroMayor = devolverNumeroMayor(n, m);
        System.out.println("El numero mayor es: " + numeroMayor);

    }
}
