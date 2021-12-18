package POO2;

public class Pregui�a extends Animal {
	private boolean sobe_em_�rvores;

	public Pregui�a(String nomeDoAnimal,int idadeDoAnimal) {
		super(nomeDoAnimal,idadeDoAnimal);
		this.sobe_em_�rvores = sobe_em_�rvores;
	}
	public boolean isSobe_em_�rvores() {
		return sobe_em_�rvores;
	}
	public void setSobe_em_�rvores(boolean sobe_em_�rvores) {
		this.sobe_em_�rvores = sobe_em_�rvores;
	}
	public void pregui�aInfo() {
		System.out.println("\nO nome da pregui�a �: "+getNomeDoAnimal()+". \nA idade da pregui�a � de: "+getIdadeDoAnimal()+". \nA pregui�a n�o emite nenhum som!");
	}
	public void imprimirMovimento() {
		if(sobe_em_�rvores==true) {
			System.out.println("\nEsta pregui�a sobe em muitas �rvores.");
		}
	}
}
