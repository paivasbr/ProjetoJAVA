package Quest�es3;

import java.util.Scanner;

public class Ativ_2 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int x,num,par=0,impar=0;
		
		for(x=1;x<=10;x++) {
			
			System.out.println("\nDigite o "+x+"� n�mero: ");
			num = read.nextInt();
			
			if(num%2==0){
				par++;
			}else {
				impar++;
			}
		}
			System.out.println("\nForam digitados "+par+" n�meros pares e "+impar+" �mpares.");
	}

}
