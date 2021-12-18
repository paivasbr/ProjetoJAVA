package POO2;

public class TesteCachorro {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Farinha", 13);
		
		dog.cachorroInfo();
		dog.getIdadeDoAnimal();
		dog.setSomDoAnimal();
		dog.setCorre(true);
		dog.imprimirMovimento();
	}
}
