package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] X = new int[5];
        int[] Y = new int[5];
        int[] R = new int[10];
        int aux;

        System.out.println("Digite 5 valores para X:");
        for (int i = 0; i < 5; i++) {
            X[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (X[j] > X[j + 1]) {
                    aux = X[j];
                    X[j] = X[j + 1];
                    X[j + 1] = aux;
                }
            }
        }

        System.out.println("Digite 5 valores para Y:");
        for (int i = 0; i < 5; i++) {
            Y[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (Y[j] > Y[j + 1]) {
                    aux = Y[j];
                    Y[j] = Y[j + 1];
                    Y[j + 1] = aux;
                }
            }
        }


        System.out.println("\nVetor X ordenado:");
        for (int i = 0; i < 5; i++) {
            System.out.print(X[i] + " ");
        }

        System.out.println("\n\nVetor Y ordenado:");
        for (int i = 0; i < 5; i++) {
            System.out.print(Y[i] + " ");
        }

        sc.close();
    }
}

