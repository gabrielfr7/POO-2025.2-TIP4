package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double SALARIO_MINIMO = 450.0;

        int[] codigo = new int[10];
        int[] horas = new int[10];
        char[] turno = new char[10];
        char[] categoria = new char[10];
        double[] valorHora = new double[10];
        double[] salarioInicial = new double[10];
        double[] auxilio = new double[10];
        double[] salarioFinal = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("\n=== Funcionário " + (i + 1) + " ===");

            System.out.print("Digite o código: ");
            codigo[i] = sc.nextInt();

            System.out.print("Digite o número de horas trabalhadas: ");
            horas[i] = sc.nextInt();

            do {
                System.out.print("Digite o turno (M — matutino; V — vespertino; N — noturno): ");
                turno[i] = sc.next().toUpperCase().charAt(0);
            } while (turno[i] != 'M' && turno[i] != 'V' && turno[i] != 'N');

            do {
                System.out.print("Digite a categoria (O — operário; G — gerente): ");
                categoria[i] = sc.next().toUpperCase().charAt(0);
            } while (categoria[i] != 'O' && categoria[i] != 'G');

            if (categoria[i] == 'G') {
                if (turno[i] == 'N') {
                    valorHora[i] = SALARIO_MINIMO * 0.18;
                } else { // M ou V
                    valorHora[i] = SALARIO_MINIMO * 0.15;
                }
            } else { 
                if (turno[i] == 'N') {
                    valorHora[i] = SALARIO_MINIMO * 0.13;
                } else { 
                    valorHora[i] = SALARIO_MINIMO * 0.10;
                }
            }

            salarioInicial[i] = valorHora[i] * horas[i];

            if (salarioInicial[i] <= 300) {
                auxilio[i] = salarioInicial[i] * 0.20;
            } else if (salarioInicial[i] <= 600) {
                auxilio[i] = salarioInicial[i] * 0.15;
            } else {
                auxilio[i] = salarioInicial[i] * 0.05;
            }

            salarioFinal[i] = salarioInicial[i] + auxilio[i];
        }

        System.out.println("\n==== FOLHA DE PAGAMENTO ====");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nFuncionário código: " + codigo[i]);
            System.out.println("Horas trabalhadas: " + horas[i]);
            System.out.printf("Valor da hora trabalhada: R$ %.2f%n", valorHora[i]);
            System.out.printf("Salário inicial: R$ %.2f%n", salarioInicial[i]);
            System.out.printf("Auxílio alimentação: R$ %.2f%n", auxilio[i]);
            System.out.printf("Salário final: R$ %.2f%n", salarioFinal[i]);
        }

        sc.close();
    }
}

