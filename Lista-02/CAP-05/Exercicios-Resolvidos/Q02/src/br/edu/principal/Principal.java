package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro e positivo: ");
        int n = sc.nextInt();

        double e = 1.0; 
        int fat;        

        
        for (int i = 1; i <= n; i++) {
            fat = 1;

           
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }

           
            e += 1.0 / fat;
        }

        System.out.println("O valor de E é: " + e);

        sc.close();
    }
}
