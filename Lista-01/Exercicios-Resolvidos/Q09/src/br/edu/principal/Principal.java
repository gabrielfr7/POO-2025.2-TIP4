package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double valorBase, valorAltura, areaTriangulo;

        System.out.println("Digite a base do triangulo:");
        valorBase = sc.nextDouble();

        System.out.println("Digite a altura do triangulo:");
        valorAltura = sc.nextDouble();

        areaTriangulo = (valorBase * valorAltura) / 2;

        System.out.println("Area do triangulo = " + areaTriangulo);

        sc.close();

	}

}