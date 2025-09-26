package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        int aux;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor da posição " + (i + 1) + ": ");
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (vet[j] < vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        System.out.println("\nVetor em ordem decrescente:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vet[i] + " ");
        }

        sc.close();
    }
}
