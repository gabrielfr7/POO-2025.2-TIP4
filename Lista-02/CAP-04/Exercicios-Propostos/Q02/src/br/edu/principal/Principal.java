package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, media;
        
        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        n2 = sc.nextDouble();
        
        media = (n1 + n2) / 2;
        System.out.println("Média: " + media);
        
        if (media < 3) 
        {
            System.out.println("Reprovado");
        } 
        else if (media < 7) 
        {
            System.out.println("Exame");
        } 
        else 
        {
            System.out.println("Aprovado");
        }
        
        sc.close();
    }
}