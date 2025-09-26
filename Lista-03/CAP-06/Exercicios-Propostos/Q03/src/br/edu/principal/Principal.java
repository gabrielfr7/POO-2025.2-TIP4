package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] codigos = new int[10];
        int[] estoque = new int[10];

        for (int i = 0; i < 10; i++) {
            codigos[i] = sc.nextInt();
            estoque[i] = sc.nextInt();
        }

        int codCliente, codProduto, qtd, i;
        while (true) {
            codCliente = sc.nextInt();
            if (codCliente == 0) break;
            codProduto = sc.nextInt();
            qtd = sc.nextInt();

            i = 0;
            while (i < 10 && codigos[i] != codProduto) {
                i++;
            }

            if (i == 10) {
                System.out.println("Código inexistente");
            } else {
                if (estoque[i] < qtd) {
                    System.out.println("Não temos estoque suficiente dessa mercadoria");
                } else {
                    estoque[i] -= qtd;
                    System.out.println("Pedido atendido. Obrigado e volte sempre");
                }
            }
        }

        for (i = 0; i < 10; i++) {
            System.out.println("Produto " + codigos[i] + " - Estoque: " + estoque[i]);
        }

        sc.close();
    }
}
