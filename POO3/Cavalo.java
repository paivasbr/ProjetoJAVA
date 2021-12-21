package POO3;

import POO2.Animal;

public class Cavalo extends Animal2 implements AnimalInterface{
	
		Cavalo(String nomeDoAnimal,String idadeDoAnimal,String somDoAnimal) {
			super(nomeDoAnimal,idadeDoAnimal,somDoAnimal);
			nomeClasse = "cavalo";
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
