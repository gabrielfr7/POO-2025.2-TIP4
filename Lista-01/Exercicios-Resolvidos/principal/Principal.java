package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n1, n2, n3, n4, soma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro numero: ");
		n3 = sc.nextInt();
		System.out.println("Digite o quarto numero: ");
		n4 = sc.nextInt();
		
		soma = n1 + n2 + n3 + n4;
		System.out.println("A soma final foi: " + soma);
	}
}