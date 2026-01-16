package org.ejercios;

import java.util.Scanner;

/**
 * Dado un numero N, mostrar todos los positivos menor a ese numero en orden descendiente.
 * Por ejemplo, dado el numero 5, se deberia mostrar 4, 3, 2, 1 y 0.
 */
public class Ej3 {

    public static void imprimirNumeroPositivosMenoresNDesc(int n) {
        // TODO Implementar funcion.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n = scanner.nextInt();
        imprimirNumeroPositivosMenoresNDesc(n);
    }
}
