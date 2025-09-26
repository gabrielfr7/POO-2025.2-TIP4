package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite n: ");
        int n = sc.nextInt();
        double s = sequencia(n);
        System.out.println("Resultado = " + s);
    }

    static double sequencia(int n) {
        double seq = 1;
        for (int a = 1; a <= n; a++) {
            double f = 1;
            for (int b = 1; b <= a; b++) f *= b;
            seq += 1.0 / f;
        }
        return seq;
    }
}
