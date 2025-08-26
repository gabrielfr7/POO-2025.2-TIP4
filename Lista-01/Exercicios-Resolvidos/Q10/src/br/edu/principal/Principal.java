package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        double valorRaio, areaCirculo;

	        System.out.println("Digite o raio do circulo: ");
	        valorRaio = sc.nextDouble();
	        areaCirculo = 3.1415 * valorRaio * valorRaio;
	        System.out.println("Area do circulo = " + areaCirculo);

	        sc.close();

	}

}