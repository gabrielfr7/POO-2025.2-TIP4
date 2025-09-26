package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] num = new int[8];
        int[] pos = new int[8];
        int[] neg = new int[8];
        int i, contP = 0, contN = 0;

        Scanner sc = new Scanner(System.in);

       
        for (i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + " número inteiro: ");
            num[i] = sc.nextInt();

            if (num[i] >= 0) {
                pos[contP] = num[i];
                contP++;
            } else {
                neg[contN] = num[i];
                contN++;
            }
        }

      
        if (contN == 0) {
            System.out.println("Nenhum número negativo foi digitado.");
        } else {
            System.out.println("\nNúmeros negativos:");
            for (i = 0; i < contN; i++) {
                System.out.print(neg[i] + " | ");
            }
            System.out.println();
        }

       
        if (contP == 0) {
            System.out.println("Nenhum número positivo foi digitado.");
        } else {
            System.out.println("\nNúmeros positivos:");
            for (i = 0; i < contP; i++) {
                System.out.print(pos[i] + " | ");
            }
            System.out.println();
        }

        sc.close();
    }
}
