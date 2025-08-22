package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		double sal, salreceber, imp;
		System.out.println("Digite o valor do salario:");
		sal = sc.nextDouble();
		
		imp = sal * 0.10;
		salreceber = sal + 50 - imp;
		System.out.print("O salario a receber é " + salreceber);
		
		sc.close();
		
		
		
	}

}
