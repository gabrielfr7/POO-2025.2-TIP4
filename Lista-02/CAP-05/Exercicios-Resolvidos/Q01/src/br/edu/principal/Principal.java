package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double novo_salario, percentual;
        int ano_atual;

        System.out.print("Digite o salário inicial: ");
        novo_salario = sc.nextDouble();

        System.out.print("Digite o percentual inicial:  ");
        percentual = sc.nextDouble();

        System.out.print("Digite o ano atual: ");
        ano_atual = sc.nextInt();

       
        for (int i = 2007; i <= ano_atual; i++) {
            percentual = 2 * percentual;
            novo_salario = novo_salario + percentual * novo_salario;
           
            System.out.println("Ano " + i + " -> Salário: " + novo_salario);
        }

        System.out.println("\nSalário final em " + ano_atual + ": " + novo_salario);

        sc.close();
    }
}

