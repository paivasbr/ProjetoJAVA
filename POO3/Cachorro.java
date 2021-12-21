package POO3;

import POO2.Animal;

public class Cachorro extends Animal2 implements AnimalInterface {
	
	Cachorro(String nomeDoAnimal,String idadeDoAnimal,String somDoAnimal) {
		super(nomeDoAnimal,idadeDoAnimal,somDoAnimal);
		nomeClasse = "cachorro";
	}
	@Override
	public String getNomeDoAnimal(){
		return nomeDoAnimal;
	}
	public String getIdadeDoAnimal() {
		return idadeDoAnimal;
	}
	public String getSomDoAnimal() {
		return somDoAnimal;
	}
}
