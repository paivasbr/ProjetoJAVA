package POO3;

public class TesteAnimal {
	public static void main(String[] args) 
	{
		Cachorro animal1 = new Cachorro("Fufly","2 anos","Au..Au..");
		Cavalo animal2 = new Cavalo("Faísca","13 anos","Relincho.");
		Preguiça animal3 = new Preguiça("Preguiça","108 anos","Este animal não emite sons");
		
		System.out.println("\nO animal é: "+animal1.getNomeClasse()+"\nO nome é: "+animal1.getNomeDoAnimal()+"\nA idade do cachorro é: "+animal1.getIdadeDoAnimal()+". \nO som do animal é: "+animal1.getSomDoAnimal());
		System.out.println("\nO animal é: "+animal2.getNomeClasse()+"\nO nome é: "+animal2.getNomeDoAnimal()+"\nA idade do cavalo é: "+animal2.getIdadeDoAnimal()+". \nO som do animal é: "+animal2.getSomDoAnimal());
		System.out.println("\nO animal é: "+animal3.getNomeClasse()+"\nO nome é: "+animal3.getNomeDoAnimal()+"\nA idade da preguiça é: "+animal3.getIdadeDoAnimal()+". \nO som do animal é: "+animal3.getSomDoAnimal());
	}
}