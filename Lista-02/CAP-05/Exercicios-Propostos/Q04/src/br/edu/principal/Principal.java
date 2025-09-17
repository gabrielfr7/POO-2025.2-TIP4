package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int n, result, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        for (i = 0; i <= 10; i++) {
            result = n * i;
            System.out.println(n + " × " + i + " = " + result);
        }

        sc.close();
    }
}