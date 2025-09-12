package br.edu.principal;
import java.util.Scanner;



public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de termos da série: ");
        int numTermos = sc.nextInt();

        System.out.print("Digite um valor positivo para X: ");
        double x = sc.nextDouble();

        double somaSerie = 0.0;   
        int denominador = 1;       
        int direcao = 1;          

        System.out.println("\nCalculando a série:");

        for (int termo = 1; termo <= numTermos; termo++) {

           
            int fatorial = 1;
            for (int i = 1; i <= denominador; i++) {
                fatorial *= i;
            }

            int expoente = termo + 1;         

           
            double potencia = 1.0;
            for (int i = 1; i <= expoente; i++) {
                potencia *= x;
            }

          
            double valorTermo = (expoente % 2 == 0) ? -potencia / fatorial : potencia / fatorial;

            System.out.printf("Termo %2d: X^%d / %d! = %f\n", termo, expoente, denominador, valorTermo);

            somaSerie += valorTermo;

            if (denominador == 4) direcao = -1;
            if (denominador == 1) direcao = 1;
            denominador += direcao;
        }

        System.out.printf("\nValor final da série: %f\n", somaSerie);

        sc.close();
    }
}


