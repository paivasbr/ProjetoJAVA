package POO3;

public class TesteAnimal {
	public static void main(String[] args) 
	{
		Cachorro animal1 = new Cachorro("Fufly","2 anos","Au..Au..");
		Cavalo animal2 = new Cavalo("Fa�sca","13 anos","Relincho.");
		Pregui�a animal3 = new Pregui�a("Pregui�a","108 anos","Este animal n�o emite sons");
		
		System.out.println("\nO animal �: "+animal1.getNomeClasse()+"\nO nome �: "+animal1.getNomeDoAnimal()+"\nA idade do cachorro �: "+animal1.getIdadeDoAnimal()+". \nO som do animal �: "+animal1.getSomDoAnimal());
		System.out.println("\nO animal �: "+animal2.getNomeClasse()+"\nO nome �: "+animal2.getNomeDoAnimal()+"\nA idade do cavalo �: "+animal2.getIdadeDoAnimal()+". \nO som do animal �: "+animal2.getSomDoAnimal());
		System.out.println("\nO animal �: "+animal3.getNomeClasse()+"\nO nome �: "+animal3.getNomeDoAnimal()+"\nA idade da pregui�a �: "+animal3.getIdadeDoAnimal()+". \nO som do animal �: "+animal3.getSomDoAnimal());
	}
}