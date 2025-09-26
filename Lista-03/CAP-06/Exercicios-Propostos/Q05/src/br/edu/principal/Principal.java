package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] logica = new int[15];
        int[] linguagem = new int[15];

        System.out.println("Digite as matrículas dos alunos que cursam Lógica:");
        for (int i = 0; i < 15; i++) {
            logica[i] = sc.nextInt();
        }

        System.out.println("Digite as matrículas dos alunos que cursam Linguagem de Programação:");
        for (int i = 0; i < 15; i++) {
            linguagem[i] = sc.nextInt();
        }

        System.out.println("Alunos que cursam simultaneamente Lógica e Linguagem de Programação:");
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (logica[i] == linguagem[j]) {
                    System.out.println("Matrícula: " + logica[i]);
                }
            }
        }

        sc.close();
    }
}
