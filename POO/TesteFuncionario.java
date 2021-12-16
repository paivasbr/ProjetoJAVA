package POO;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionário[] BancoDeDados = new Funcionário[3];
		
		BancoDeDados[0] = new Funcionário("Manuel Lima",3200);
		BancoDeDados[1] = new Funcionário("Paloma Dutra",4400);
		BancoDeDados[2] = new Funcionário("Erika Costa",90);
		
		for(Funcionário roda:BancoDeDados) {
			roda.imprimir();
		}
		System.out.println("\nO aumento de salário foi de: ");
		
		for(Funcionário roda:BancoDeDados) {
			roda.aumentoDeSalario(10);
			roda.imprimir();
		}
	}
}
