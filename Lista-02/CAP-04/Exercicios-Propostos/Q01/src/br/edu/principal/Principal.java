package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, media;
        
        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        n2 = sc.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        n3 = sc.nextDouble();
        
        System.out.print("Digite a quarta nota: ");
        n4 = sc.nextDouble();
        
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("Media: " + media);
        
        if (media >= 7) 
        {
            System.out.println("Aprovado");
        }
        else 
        {
            System.out.println("Reprovado");
        }
        
        sc.close();
    }
}