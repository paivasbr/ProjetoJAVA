package POO3;

import POO2.Animal;

public class Preguiça extends Animal2 implements AnimalInterface {

	Preguiça(String nomeDoAnimal,String idadeDoAnimal,String somDoAnimal) {
		super(nomeDoAnimal,idadeDoAnimal,somDoAnimal);
		nomeClasse = "preguiça";
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