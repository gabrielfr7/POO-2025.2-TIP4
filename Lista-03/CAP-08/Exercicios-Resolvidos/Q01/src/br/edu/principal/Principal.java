// Principal.java
package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int x = verifica(num);
        if (x == 0) System.out.println("Número positivo");
        else System.out.println("Número negativo");
    }

    static int verifica(int num) {
        if (num >= 0) return 1;
        else return 0;
    }
}
