package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        double valorDeposito, taxaJuros, valorRendimento, valorTotal;

	        System.out.println("Digite o valor do deposito:");
	        valorDeposito = sc.nextDouble();

	        System.out.println("Digite a taxa de juros:");
	        taxaJuros = sc.nextDouble();

	        valorRendimento = valorDeposito * (taxaJuros / 100);
	        valorTotal = valorDeposito + valorRendimento;

	        System.out.println("Rendimento = " + valorRendimento);
	        System.out.println("Total depois do rendimento = " + valorTotal);

	        sc.close();

	}

}