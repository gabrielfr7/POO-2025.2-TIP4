package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite nota1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite nota2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite nota3: ");
        double nota3 = sc.nextDouble();
        String letra;
        do {
            System.out.print("Digite 'A' para aritmética ou 'P' para ponderada: ");
            letra = sc.next();
        } while (!letra.equals("A") && !letra.equals("P"));
        double m = calculaMedia(nota1, nota2, nota3, letra);
        if (letra.equals("A")) System.out.println("Média aritmética = " + m);
        else System.out.println("Média ponderada = " + m);
    }

    static double calculaMedia(double n1, double n2, double n3, String l) {
        if (l.equals("A")) return (n1 + n2 + n3) / 3;
        else return (n1 * 5 + n2 * 3 + n3 * 2) / 10;
    }
}
