package POO2;

public class Preguiça extends Animal {
	private boolean sobe_em_árvores;

	public Preguiça(String nomeDoAnimal,int idadeDoAnimal) {
		super(nomeDoAnimal,idadeDoAnimal);
		this.sobe_em_árvores = sobe_em_árvores;
	}
	public boolean isSobe_em_árvores() {
		return sobe_em_árvores;
	}
	public void setSobe_em_árvores(boolean sobe_em_árvores) {
		this.sobe_em_árvores = sobe_em_árvores;
	}
	public void preguiçaInfo() {
		System.out.println("\nO nome da preguiça é: "+getNomeDoAnimal()+". \nA idade da preguiça é de: "+getIdadeDoAnimal()+". \nA preguiça não emite nenhum som!");
	}
	public void imprimirMovimento() {
		if(sobe_em_árvores==true) {
			System.out.println("\nEsta preguiça sobe em muitas árvores.");
		}
	}
}
