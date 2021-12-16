package Questões2;

import java.util.Scanner;

public class Ativ_3 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int idade;
		/*10-14 infantil;
		 * 15-17 juvenil;
		 * 18-25 adulto; 
		 */

		System.out.println("Qual a sua idade?: ");
		idade=read.nextInt();
		
		if(idade>=10 && idade<15) {
			System.out.printf("\nA sua categoria de idade é a infantil.");
		}else if(idade>=15 && idade<18) {
			System.out.printf("\nA sua categoria de idade é a juvenil.");
		}else if(idade>=18 && idade <=25) {
			System.out.printf("\nA sua categoria de idade é adulto.");
		}else {
			System.out.printf("\nVocê não se encontra em nenhuma das categorias de idades preestabelecidas.");
		}
	}

}
