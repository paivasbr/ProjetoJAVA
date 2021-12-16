package Questões;

import java.util.Scanner;

public class Ativ_8 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double custoDeFabrica,custoDeConsumo;
		
		System.out.println("\nQual o valor do custo de fábrica?: ");
		custoDeFabrica = read.nextDouble();
		
		custoDeConsumo = custoDeFabrica + (custoDeFabrica*0.73);
		
		System.out.printf("\nCusto ao consumidor R$ %.2f",custoDeConsumo);
	}
}