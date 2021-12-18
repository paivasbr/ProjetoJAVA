package POO2;

public class Cachorro extends Animal{
	private boolean corre;
	
	public Cachorro(String nomeDoAnimal,int idadeDoAnimal) {
		super(nomeDoAnimal,idadeDoAnimal);
		this.corre = corre;
	}
	public boolean isCorre() {
		return corre;
	}
	public void setCorre(boolean corre) {
		this.corre = corre;
	
	}
	public void cachorroInfo() {
		System.out.println("\nO nome do cachorro �: "+getNomeDoAnimal()+". \nA idade deste cachorro � de: "+getIdadeDoAnimal()+". \nO som emitido pelo cachorro �: ");
	}
	public void imprimirMovimento() {
		if(corre==true) {
			System.out.println("\nEste cachorro gosta muito de correr.");
		}
	}
}