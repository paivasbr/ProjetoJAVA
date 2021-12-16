package POO1;

	public class Publico extends Telefone {
		public Publico() {
			super("Telefone Publico");
	}
		@Override
		public void toca(int numToques) {
			for(int i=0;i<numToques;i++) {
				System.out.println("\nAlô amor, tô te ligando de um orelhão...");
				System.out.println("\nTô ligando para vc do orelhão da rua");
		}
	}
		@Override
		public void disca(String numero) {
			if(numero.charAt(0)=='9' || numero.charAt(0)=='8') {
				System.out.println("\nEste telefone não liga para celular..");
		}
			else {
				System.out.println("\nDiscando:...."+numero);
			}
	}
}
