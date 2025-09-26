// Principal.java
package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite os segundos: ");
        int seg = sc.nextInt();
        transformacao(seg);
    }

    static void transformacao(int segundos) {
        int h = segundos / 3600;
        int r = segundos % 3600;
        int m = r / 60;
        int s = r % 60;
        System.out.println(h + "h " + m + "m " + s + "s");
    }
}
