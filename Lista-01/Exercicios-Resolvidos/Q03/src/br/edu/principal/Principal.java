package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3;
        double peso1, peso2, peso3;
        double media;

        // Lendo notas
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        // Lendo pesos
        System.out.print("Digite o peso da primeira nota: ");
        peso1 = sc.nextDouble();

        System.out.print("Digite o peso da segunda nota: ");
        peso2 = sc.nextDouble();

        System.out.print("Digite o peso da terceira nota: ");
        peso3 = sc.nextDouble();

        // Calculando a média ponderada
        media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        // Mostrando o resultado
        System.out.println("A média ponderada é: " + media);

        sc.close();
    }
}
