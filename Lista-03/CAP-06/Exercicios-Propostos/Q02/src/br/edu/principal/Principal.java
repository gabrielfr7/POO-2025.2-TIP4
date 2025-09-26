package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[7];

        System.out.println("Digite 7 números inteiros:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vet[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros múltiplos de 2:");
        for (int i = 0; i < 7; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
            }
        }

        System.out.println("\n\nNúmeros múltiplos de 3:");
        for (int i = 0; i < 7; i++) {
            if (vet[i] % 3 == 0) {
                System.out.print(vet[i] + " ");
            }
        }

        System.out.println("\n\nNúmeros múltiplos de 2 e de 3:");
        for (int i = 0; i < 7; i++) {
            if (vet[i] % 2 == 0 && vet[i] % 3 == 0) {
                System.out.print(vet[i] + " ");
            }
        }

        sc.close();
    }
}

