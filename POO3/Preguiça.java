package POO3;

import POO2.Animal;

public class Pregui�a extends Animal2 implements AnimalInterface {

	Pregui�a(String nomeDoAnimal,String idadeDoAnimal,String somDoAnimal) {
		super(nomeDoAnimal,idadeDoAnimal,somDoAnimal);
		nomeClasse = "pregui�a";
	}
	@Override
	public String getNomeDoAnimal() {
		return nomeDoAnimal;
	}
	public String getIdadeDoAnimal() {
		return idadeDoAnimal;
	}
	public String getSomDoAnimal() {
		return somDoAnimal;
	}
}