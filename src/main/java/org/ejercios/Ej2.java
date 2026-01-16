package org.ejercios;

import java.util.Scanner;

/**
 * Dado un numero N, mostrar todos los positivos menor a ese numero.
 * Por ejemplo, dado el numero 5, se deberia mostrar 0, 1, 2, 3 y 4.
 */
public class Ej2 {

    public static void imprimirNumeroPositivosMenoresN(int n) {
        // TODO Implementar funcion.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n = scanner.nextInt();
        imprimirNumeroPositivosMenoresN(n);
    }
}
