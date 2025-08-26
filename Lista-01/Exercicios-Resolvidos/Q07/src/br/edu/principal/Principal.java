package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double salarioBase, salarioFinal, valorImposto;

        System.out.println("Digite o valor do salario base: ");
        salarioBase = sc.nextDouble();
        valorImposto = salarioBase * 0.10;
        salarioFinal = salarioBase + 50 - valorImposto;

        System.out.println("O salario a receber é: " + salarioFinal);

        sc.close();
	}

}