// Principal.java
package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        int s = somar(num1, num2);
        System.out.println("Soma = " + s);
    }

    static int somar(int num1, int num2) {
        int s = 0;
        for (int i = num1 + 1; i <= num2 - 1; i++) {
            s += i;
        }
        return s;
    }
}
