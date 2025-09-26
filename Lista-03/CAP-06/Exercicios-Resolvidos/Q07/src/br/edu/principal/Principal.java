package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[8];
        int aux, j, z;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o valor da posição " + (i + 1) + ": ");
            aux = sc.nextInt();

            j = 0;
            while (j < i && vet[j] < aux) {
                j++;
            }

            z = i;
            while (z >= j + 1) {
                vet[z] = vet[z - 1];
                z--;
            }

            vet[j] = aux;
        }

        System.out.println("\nVetor em ordem decrescente:");
        for (int i = 0; i < 8; i++) {
            System.out.print(vet[i] + " ");
        }

        sc.close();
    }
}

