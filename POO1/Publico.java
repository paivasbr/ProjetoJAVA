package POO1;

	public class Publico extends Telefone {
		public Publico() {
			super("Telefone Publico");
	}
		@Override
		public void toca(int numToques) {
			for(int i=0;i<numToques;i++) {
				System.out.println("\nAl� amor, t� te ligando de um orelh�o...");
				System.out.println("\nT� ligando para vc do orelh�o da rua");
		}
	}
		@Override
		public void disca(String numero) {
			if(numero.charAt(0)=='9' || numero.charAt(0)=='8') {
				System.out.println("\nEste telefone n�o liga para celular..");
		}
			else {
				System.out.println("\nDiscando:...."+numero);
			}
	}
}
