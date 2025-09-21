package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdeMenor18 = 0, tot80 = 0;
        double mediaAltura = 0;

        for (int cont_time = 1; cont_time <= 5; cont_time++) {
            double somaIdadeTime = 0;

            System.out.println("\n=== Time " + cont_time + " ===");

            for (int cont_jog = 1; cont_jog <= 11; cont_jog++) {
                System.out.println("\nJogador " + cont_jog);

                System.out.print("Digite a idade: ");
                int idade = sc.nextInt();

                System.out.print("Digite o peso (kg): ");
                double peso = sc.nextDouble();

                System.out.print("Digite a altura (m): ");
                double altura = sc.nextDouble();

                if (idade < 18) {
                    qtdeMenor18++;
                }

                somaIdadeTime += idade;
                mediaAltura += altura;

                if (peso > 80) {
                    tot80++;
                }
            }

            double mediaIdadeTime = somaIdadeTime / 11.0;
            System.out.println("Média de idade do time " + cont_time + " = " + mediaIdadeTime);
        }

        mediaAltura = mediaAltura / 55.0;

        double porc = (tot80 * 100.0) / 55.0;

        System.out.println("\n==== Estatísticas Gerais ====");
        System.out.println("Quantidade de jogadores com idade < 18 anos: " + qtdeMenor18);
        System.out.println("Média de altura de todos os jogadores: " + mediaAltura);
        System.out.println("Porcentagem de jogadores com peso > 80kg: " + porc + "%");

        sc.close();
    }
}

