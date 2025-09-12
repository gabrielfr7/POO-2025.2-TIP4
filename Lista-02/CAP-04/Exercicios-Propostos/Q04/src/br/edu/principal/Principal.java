package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3;
        
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();
        
        System.out.print("Digite o terceiro número: ");
        n3 = sc.nextDouble();
        
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("Maior: " + n1);
            } else {
                System.out.println("Maior: " + n3);
            }
        } else if (n2 > n3) {
            System.out.println("Maior: " + n2);
        } else {
            System.out.println("Maior: " + n3);
        }
        
        sc.close();
    }
}