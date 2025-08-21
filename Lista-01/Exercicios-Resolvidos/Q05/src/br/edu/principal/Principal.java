package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double sal, perc, aumento, novosal;
		
		System.out.print("Escreva o valor do salario:");
		sal = sc.nextDouble();
		
		System.out.println("Escreva o valor do percentual:");
		perc = sc.nextDouble();
		
		aumento = sal * perc/100;
		
		System.out.println("Valor do aumento " + aumento);
		novosal = sal + aumento;
		System.out.println("Novo salario:" + novosal);
	
		sc.close();
	
	}


}
