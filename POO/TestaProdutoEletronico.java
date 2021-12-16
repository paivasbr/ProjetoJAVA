package POO;

public class TestaProdutoEletronico {
	public static void main(String[] args) {
		
		ProdutoEletronico[] lista = new ProdutoEletronico[4];
		
		lista[0] = new ProdutoEletronico("SmartPhone",208905);
		lista[1] = new ProdutoEletronico("Notebook",492712);
		lista[2] = new ProdutoEletronico("VideoGame",769900);
		lista[3] = new ProdutoEletronico("Tablet",209100);
		
		for(ProdutoEletronico roda:lista) {
			roda.imprimir();
		}
		System.out.println("\nO aumento nos valores dos produtos foi de: ");
		
		for(ProdutoEletronico roda:lista) {
			roda.aumentoNoValorDoProduto(10);
			roda.imprimir();
		}
	}
}
