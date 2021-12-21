package POO3;

public class Animal2 {
	protected String nomeDoAnimal;
	protected String idadeDoAnimal;
	protected String somDoAnimal;
	protected String nomeClasse;
	
	public Animal2(String n,String i,String s) {
		this.setNomeDoAnimal(n);
		this.setIdadeDoAnimal(i);
		this.setSomDoAnimal(s);
	}
	public String getNomeDoAnimal() {
		return nomeDoAnimal;
	}
	public void setNomeDoAnimal(String nomeDoAnimal) {
		this.nomeDoAnimal = nomeDoAnimal;
	}
	public String getIdadeDoAnimal() {
		return idadeDoAnimal;
	}
	public void setIdadeDoAnimal(String idadeDoAnimal) {
		this.idadeDoAnimal = idadeDoAnimal;
	}
	public String getSomDoAnimal() {
		return somDoAnimal;
	}
	public void setSomDoAnimal(String somDoAnimal) {
		this.somDoAnimal = somDoAnimal;
	}	
	public String getNomeClasse() {
		return nomeClasse;
	}
	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
}

