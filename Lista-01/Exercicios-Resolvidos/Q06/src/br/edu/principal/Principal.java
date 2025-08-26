package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 double salarioBase, salarioFinal, valorGratificacao, valorImposto;
		 
		 System.out.println("Digite o valor do salario:");
	        salarioBase = sc.nextDouble();

	        valorGratificacao = salarioBase * 0.05;
	        valorImposto = salarioBase * 0.07;
	        salarioFinal = salarioBase + valorGratificacao - valorImposto;

	        System.out.println("O salario a receber é: " + salarioFinal);

	        sc.close();

	}

}