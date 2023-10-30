package org.example;

import java.util.Random;

public class LanzamientoDeDados {
    public static void main(String[] args) {
        Random random = new Random();

        // Simula el lanzamiento del primer dado
        int dado1 = random.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6

        // Simula el lanzamiento del segundo dado
        int dado2 = random.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6

        System.out.println("Primer dado: " + dado1);
        System.out.println("Segundo dado: " + dado2);
    }
}
