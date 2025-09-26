package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[15];

        for (int i = 0; i < 15; i++) {
            vet[i] = sc.nextInt();
        }

        boolean achou = false;
        for (int i = 0; i < 15; i++) {
            if (vet[i] == 30) {
                System.out.println("Número 30 encontrado na posição: " + i);
                achou = true;
            }
        }

        if (!achou) {
            System.out.println("Número 30 não encontrado no vetor");
        }

        sc.close();
    }
}
