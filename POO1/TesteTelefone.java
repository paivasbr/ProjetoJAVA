package POO1;

public class TesteTelefone {
	public static void main(String[] args) {
		
		Celular celular = new Celular();
		Fixo fixo = new Fixo();
		Publico publico = new Publico();
		Telefone telefone = null;   //criando variavel null (n�o � uma instancia��o)
		
		int n = (int) (Math.random()*3.0);//random-pega n�meros aleatorios(manupula-lo para pegar parte inteira dos 3 primeiros n�meros)
		System.out.println("\nN�mero escolhido: "+n);
		
		switch(n) {
		case 0: telefone = celular; break;
		case 1: telefone = fixo; break;
		case 2: telefone = publico; break;
		default: System.out.println("\nErro inesperado!");
		}
		if(telefone!=null) {
			telefone.toca(3);
			telefone.disca("945177343");
		}
	}
}
