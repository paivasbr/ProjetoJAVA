package POO2;

public class TesteCavalo {
	public static void main(String[] args) {
		Cavalo horse = new Cavalo("Beleza Negra", 15);
		
		horse.cavaloInfo();
		horse.getIdadeDoAnimal();
		horse.setSomDoAnimal();
		horse.setCorre(true);
		horse.imprirmirMovimento();
	}
}
