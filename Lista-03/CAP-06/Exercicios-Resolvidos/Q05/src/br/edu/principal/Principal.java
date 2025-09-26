package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] X = new int[10];
        int[] Y = new int[10];
        int[] U = new int[20];
        int[] D = new int[10];
        int[] S = new int[10];
        int[] P = new int[10];
        int[] IT = new int[10];

        int i, j, k;
        int cont_u = 0, cont_d = 0, cont_i = 0;

        for (i = 0; i < 10; i++) {
            System.out.print("Digite X[" + (i + 1) + "]: ");
            X[i] = sc.nextInt();

            System.out.print("Digite Y[" + (i + 1) + "]: ");
            Y[i] = sc.nextInt();
        }

        for (i = 0; i < 10; i++) {
            j = 0;
            while (j < cont_u && X[i] != U[j]) {
                j++;
            }
            if (j >= cont_u) {
                U[cont_u] = X[i];
                cont_u++;
            }
        }

        for (i = 0; i < 10; i++) {
            j = 0;
            while (j < cont_u && Y[i] != U[j]) {
                j++;
            }
            if (j >= cont_u) {
                U[cont_u] = Y[i];
                cont_u++;
            }
        }

        System.out.println("\nUnião (U):");
        for (i = 0; i < cont_u; i++) {
            System.out.print(U[i] + " ");
        }
        System.out.println();

        for (i = 0; i < 10; i++) {
            j = 0;
            while (j < 10 && X[i] != Y[j]) {
                j++;
            }
            if (j >= 10) {
                k = 0;
                while (k < cont_d && X[i] != D[k]) {
                    k++;
                }
                if (k >= cont_d) {
                    D[cont_d] = X[i];
                    cont_d++;
                }
            }
        }

        System.out.println("\nDiferença (D = X - Y):");
        for (i = 0; i < cont_d; i++) {
            System.out.print(D[i] + " ");
        }
        System.out.println();

        for (i = 0; i < 10; i++) {
            S[i] = X[i] + Y[i];
            P[i] = X[i] * Y[i];
        }

        System.out.println("\nSoma elemento a elemento (S):");
        for (i = 0; i < 10; i++) {
            System.out.print(S[i] + " ");
        }
        System.out.println();

        System.out.println("\nProduto elemento a elemento (P):");
        for (i = 0; i < 10; i++) {
            System.out.print(P[i] + " ");
        }
        System.out.println();

        for (i = 0; i < 10; i++) {
            j = 0;
            while (j < 10 && X[i] != Y[j]) {
                j++;
            }
            if (j < 10) {
                k = 0;
                while (k < cont_i && IT[k] != X[i]) {
                    k++;
                }
                if (k >= cont_i) {
                    IT[cont_i] = X[i];
                    cont_i++;
                }
            }
        }

        System.out.println("\nInterseção (IT):");
        for (i = 0; i < cont_i; i++) {
            System.out.print(IT[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
