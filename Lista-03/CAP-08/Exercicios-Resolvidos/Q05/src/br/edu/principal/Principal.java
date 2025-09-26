// Principal.java
package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o preço antigo: ");
        double precoAntigo = sc.nextDouble();
        System.out.print("Digite o preço atual: ");
        double precoAtual = sc.nextDouble();
        double acrescimo = calculoReajuste(precoAntigo, precoAtual);
        System.out.println("Acréscimo = " + acrescimo + "%");
    }

    static double calculoReajuste(double pa, double pn) {
        return (100 * pn - 100 * pa) / pa;
    }
}
