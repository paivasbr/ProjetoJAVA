package POO1;

public class Celular extends Telefone { //indica que a subclasse celular herda tudo que tem na classe telefone (rela��o de heran�a).
	//contrutor
	public Celular() {
		super("Telefone Celular"); //referencia a superclasse telefone
	}
	
	@Override // indica o m�todo polimorfico 
	public void toca(int numToque) { //
		switch(numToque) {
			case 1:
				System.out.println("\nTrimmm,Trimmm,Trimmm");
				break;
			case 2:
				System.out.println("\nPrimmm,Primmm,Primmm");
				break;
				default:
					System.out.println("\nPOBRE LIGANDO PRA MIM...");
		}
	}
	@Override //m�todo sobrescrito da superclasse
	public void disca(String numero) {
		System.out.println("\nO n�mero: "+numero+"� um celular...");
	}
}
