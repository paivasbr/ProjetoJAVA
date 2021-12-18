package POO2;

public class Animal {
	private String nomeDoAnimal;
	private int idadeDoAnimal;
	
	public Animal(String n,int i) {
		this.setNomeDoAnimal(n);
		this.setIdadeDoAnimal(i);
	}
	public String getNomeDoAnimal() {
		return nomeDoAnimal;
	}
	public void setNomeDoAnimal(String nomeDoAnimal) {
		this.nomeDoAnimal = nomeDoAnimal;
	}
	public int getIdadeDoAnimal() {
		return idadeDoAnimal;
	}
	public void setIdadeDoAnimal(int idadeDoAnimal) {
		this.idadeDoAnimal = idadeDoAnimal;
	}
	public void setSomDoAnimal() {
		System.out.println("\nAuuuuuuu.....Auuuuu.....");
	}
		
}
