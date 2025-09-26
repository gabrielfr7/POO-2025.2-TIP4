package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] gabarito = new String[8];
        String resposta;
        int num, pontos, tot_ap = 0, perc_ap, i, j;

        System.out.println("=== Cadastro do gabarito ===");
        for (i = 0; i < 8; i++) {
            System.out.print("Digite a resposta da questão " + (i + 1) + ": ");
            gabarito[i] = sc.nextLine().toUpperCase();
        }

        for (i = 0; i < 10; i++) {
            System.out.print("\nDigite o número do " + (i + 1) + "º aluno: ");
            num = sc.nextInt();
            sc.nextLine(); 

            pontos = 0;
            for (j = 0; j < 8; j++) {
                System.out.print("Digite a resposta dada pelo aluno " + num + " à " + (j + 1) + "ª questão: ");
                resposta = sc.nextLine().toUpperCase();

                if (resposta.equals(gabarito[j])) {
                    pontos++;
                }
            }

            System.out.println("A nota do aluno " + num + " foi " + pontos);

            if (pontos >= 6) {
                tot_ap++;
            }
        }

        
        perc_ap = (tot_ap * 100) / 10;
        System.out.println("\nO percentual de alunos aprovados é " + perc_ap + "%");

        sc.close();
    }
}
