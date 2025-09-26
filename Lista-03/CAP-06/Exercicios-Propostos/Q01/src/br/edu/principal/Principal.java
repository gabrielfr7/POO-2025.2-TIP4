package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[6];
        int qtdPares = 0, qtdImpares = 0;

       
        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vet[i] = sc.nextInt();
        }

       
        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < 6; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
                qtdPares++;
            }
        }
        System.out.println("\nQuantidade de pares: " + qtdPares);

      
        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < 6; i++) {
            if (vet[i] % 2 != 0) {
                System.out.print(vet[i] + " ");
                qtdImpares++;
            }
        }
        System.out.println("\nQuantidade de ímpares: " + qtdImpares);

        sc.close();
    }
}
