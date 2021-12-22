package POO4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Estoque {
	public static void main(String[] args) {
		Collection<String> hair = new ArrayList();
		
		hair.add("Shampoo");
		hair.add("Condicionador");
		hair.add("Secador");
		hair.add("Escova");
		hair.add("Chapinha");
		
		for(String produto : hair) {
			System.out.println("Possui em estoque o produto: "+produto);
		}
		
		System.out.println("\nContém o produto Alisante? "+hair.contains("Alisante"));
		System.out.println("\nProdutos: "+hair);
		System.out.println("\nEstoque de Produtos para cabelo: "+hair);
		hair.remove("Escova");
		System.out.println("Atualização do estoque de produtos para cabelo: "+hair);
	}
}
	