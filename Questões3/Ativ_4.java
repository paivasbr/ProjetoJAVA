package Questões3;

import java.util.*;

public class Ativ_4 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int sexo, idade, temp;
		int pCal=0,mNer=0,hAgr=0,oCal=0,pNerMa40=0,pCalMe18=0, pessoas=0;

				
		while(pessoas<5){
			
			System.out.println("\nInforme sua idade: ");
			idade=read.nextInt();
			System.out.println("\nInforme seu sexo");
			System.out.println("\n1- Feminino");
			System.out.println("\n2- Masculino");
			System.out.println("\n3- Outros");
			sexo=read.nextInt();
			
			switch(sexo){
				case 1:
					System.out.println("\nVocê se identifica como uma pessoa: ");
					System.out.println("\n1- Você é calma.");
					System.out.println("\n2- Você é nervosa.");
					System.out.println("\n3- Você é agressiva.");
					temp=read.nextInt();
					if(idade<18 && temp==1)
					{
						pCalMe18++;
						pCal++;
					}
					else if(idade>40 && temp==2)
					{
						pNerMa40++;
						mNer++;
					}
					else if(temp==2)
					{
						mNer++;
					}
					else if(temp==1)
					{
						pCal++;
					}
					break;
										
					
				case 2:
					System.out.println("\nVocê se identifica como uma pessoa: ");
					System.out.println("\n1- Você é calmo.");
					System.out.println("\n2- Você é nervoso.");
					System.out.println("\n3- Você é agressivo.");
					temp=read.nextInt();
					if(idade<18 && temp==1)
					{
						pCalMe18++;
						pCal++;
					}
					else if(temp==3)
					{
						hAgr++;
					}
					else if(idade>40 && temp==2)
					{
						pNerMa40++;
					}
					else if(temp==1)
					{
						pCal++;
					}
					break;
					
					
				case 3:
					System.out.println("\nVocê se identifica como uma pessoa: ");
					System.out.println("\n1- Você é calmo.");
					System.out.println("\n2- Você é nervoso.");
					System.out.println("\n3- Você é agressivo.");
					temp=read.nextInt();
					if(idade<18 && temp==1)
					{
						pCalMe18++;
						oCal++;
						pCal++;
					}
					else if(idade>40 && temp==2)
					{
						pNerMa40++;
					}
					else if(temp==1)
					{
						oCal++;
						pCal++;
					}
					break;
					default:
					System.out.println("\nOpção inválida!");			
			}
			pessoas++;
			
		}
		System.out.println("\nO número de pessoas calmas é de "+pCal);
		System.out.println("\nO número de mulheres nervosas é de "+mNer);
		System.out.println("\nO número de homens agressivos é de "+hAgr);
		System.out.println("\nO número de outros calmos é de "+oCal);
		System.out.println("\nO número de pessoas nervosas com mais de 40 anos é de "+pNerMa40);
		System.out.println("\nO número de pessoas calmas com menos de 18 anos é de "+pCalMe18);
	}
}
