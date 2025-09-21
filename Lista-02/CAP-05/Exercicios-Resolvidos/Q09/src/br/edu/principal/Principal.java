package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, media;
        double media_classe, total_classe = 0;
        int ta = 0, te = 0, tr = 0;

        for (int cont = 1; cont <= 6; cont++) {
            System.out.println("\nAluno " + cont);

            System.out.print("Digite a primeira nota: ");
            n1 = sc.nextDouble();

            System.out.print("Digite a segunda nota: ");
            n2 = sc.nextDouble();

            media = (n1 + n2) / 2.0;
            System.out.println("Média = " + media);

            if (media <= 3) {
                tr++;
                System.out.println("Reprovado");
            } else if (media < 7) { // significa 3 < media < 7
                te++;
                System.out.println("Exame");
            } else {
                ta++;
                System.out.println("Aprovado");
            }

            total_classe += media;
        }

        media_classe = total_classe / 6.0;

        System.out.println("\n==== Resultado da Turma ====");
        System.out.println("Total de Reprovados: " + tr);
        System.out.println("Total de Exame: " + te);
        System.out.println("Total de Aprovados: " + ta);
        System.out.println("Média da Classe: " + media_classe);

        sc.close();
    }
}

