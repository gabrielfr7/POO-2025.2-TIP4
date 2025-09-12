package br.edu.principal;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números deseja ler? ");
        int n = sc.nextInt();

     
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = sc.nextInt();
            int fat = 1;

           
            for (int j = 1; j <= num; j++) {
                fat *= j;
            }

          
            System.out.println("Número: " + num + " | Fatorial: " + fat);
        }

        sc.close();
    }
}
