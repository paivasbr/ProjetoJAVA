package POO;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcion�rio[] BancoDeDados = new Funcion�rio[3];
		
		BancoDeDados[0] = new Funcion�rio("Manuel Lima",3200);
		BancoDeDados[1] = new Funcion�rio("Paloma Dutra",4400);
		BancoDeDados[2] = new Funcion�rio("Erika Costa",90);
		
		for(Funcion�rio roda:BancoDeDados) {
			roda.imprimir();
		}
		System.out.println("\nO aumento de sal�rio foi de: ");
		
		for(Funcion�rio roda:BancoDeDados) {
			roda.aumentoDeSalario(10);
			roda.imprimir();
		}
	}
}
