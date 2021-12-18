package POO2;

public class Cavalo extends Animal {
	private boolean corre;
	
	public Cavalo(String nomeDoAnimal,int idadeDoAnimal) {
		super(nomeDoAnimal,idadeDoAnimal);
		this.corre = corre;
	}
	public boolean isCorre() {
		return corre;
	}
	public void setCorre(boolean corre) {
		this.corre = corre;
	}
	public void setSomDoAnimal() {
		System.out.println("\nPocot�, pocot�, pocot�");
	}
	public void cavaloInfo() {
		System.out.println("\nO nome do cavalo �: "+getNomeDoAnimal()+". \nA idade deste cavalo � de: "+getIdadeDoAnimal()+". \nO som emitido pelo cavalo �: ");
	}
	public void imprirmirMovimento() {
		if(corre==true) {
			System.out.println("\nEsse cavalo corre, por�m n�o muito.");
		}
	}
}
