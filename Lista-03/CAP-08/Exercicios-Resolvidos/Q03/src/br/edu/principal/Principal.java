
package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.print("Digite a: ");
            a = sc.nextInt();
        } while (a <= 1);
        System.out.print("Digite b: ");
        int b = sc.nextInt();
        System.out.print("Digite c: ");
        int c = sc.nextInt();
        int result = divisores(a, b, c);
        System.out.println("Soma dos inteiros = " + result);
    }

    static int divisores(int a, int b, int c) {
        int s = 0;
        for (int i = b; i <= c; i++) {
            if (i % a == 0) s += i;
        }
        return s;
    }
}
