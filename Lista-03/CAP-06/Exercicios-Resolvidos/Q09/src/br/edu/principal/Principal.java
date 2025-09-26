package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] voo = new int[12];
        String[] origem = new String[12];
        String[] destino = new String[12];
        int[] lugares = new int[12];

        int i, op, op2, num_voo;
        String local;

        System.out.println("=== Cadastro dos voos ===");
        for (i = 0; i < 12; i++) {
            System.out.print("Número do voo " + (i + 1) + ": ");
            voo[i] = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Origem: ");
            origem[i] = sc.nextLine();

            System.out.print("Destino: ");
            destino[i] = sc.nextLine();

            System.out.print("Lugares disponíveis: ");
            lugares[i] = sc.nextInt();
            sc.nextLine(); // limpar buffer

            System.out.println();
        }

        // Menu principal
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Consultar");
            System.out.println("2 - Reservar");
            System.out.println("3 - Finalizar");
            System.out.print("Digite sua opção: ");
            op = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (op == 1) {
                System.out.println("\n1 - Consulta por voo");
                System.out.println("2 - Consulta por origem");
                System.out.println("3 - Consulta por destino");
                System.out.print("Digite sua opção: ");
                op2 = sc.nextInt();
                sc.nextLine();

                if (op2 == 1) {
                    System.out.print("Digite o número do voo: ");
                    num_voo = sc.nextInt();
                    sc.nextLine();

                    i = 0;
                    while (i < 12 && voo[i] != num_voo) {
                        i++;
                    }
                    if (i >= 12) {
                        System.out.println("Voo inexistente.");
                    } else {
                        System.out.println("\nNúmero do voo: " + voo[i]);
                        System.out.println("Origem: " + origem[i]);
                        System.out.println("Destino: " + destino[i]);
                        System.out.println("Lugares disponíveis: " + lugares[i]);
                    }
                }

                else if (op2 == 2) {
                    System.out.print("Digite o local de origem: ");
                    local = sc.nextLine();

                    for (i = 0; i < 12; i++) {
                        if (local.equalsIgnoreCase(origem[i])) {
                            System.out.println("\nNúmero do voo: " + voo[i]);
                            System.out.println("Origem: " + origem[i]);
                            System.out.println("Destino: " + destino[i]);
                            System.out.println("Lugares disponíveis: " + lugares[i]);
                        }
                    }
                }

                else if (op2 == 3) {
                    System.out.print("Digite o local de destino: ");
                    local = sc.nextLine();

                    for (i = 0; i < 12; i++) {
                        if (local.equalsIgnoreCase(destino[i])) {
                            System.out.println("\nNúmero do voo: " + voo[i]);
                            System.out.println("Origem: " + origem[i]);
                            System.out.println("Destino: " + destino[i]);
                            System.out.println("Lugares disponíveis: " + lugares[i]);
                        }
                    }
                }
            }

            else if (op == 2) {
                System.out.print("Digite o número do voo desejado: ");
                num_voo = sc.nextInt();
                sc.nextLine();

                i = 0;
                while (i < 12 && voo[i] != num_voo) {
                    i++;
                }

                if (i >= 12) {
                    System.out.println("Número de voo não encontrado.");
                } else {
                    if (lugares[i] == 0) {
                        System.out.println("Voo lotado.");
                    } else {
                        lugares[i] = lugares[i] - 1;
                        System.out.println("Reserva confirmada!");
                    }
                }
            }

        } while (op != 3);

        System.out.println("\nPrograma finalizado!");
        sc.close();
    }
}
