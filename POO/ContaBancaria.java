package POO;

	public class ContaBancaria {
		private String banco;
		private String nomeDoCliente;

		public ContaBancaria (String banco, String nomeDoCliente) {
			this.banco = banco;
			this.nomeDoCliente = nomeDoCliente;
		}
		public void imprimirInfo() {
			System.out.println("\nO banco respons�vel pela conta � o: "+banco+". \nO cliente cadastrado � o Sr(a): "+nomeDoCliente);
		}
		public String getBanco() {
			return banco;
		}
		public void setBanco(String banco) {
			this.banco = banco;
		}
		public String getNomeDoCliente() {
			return nomeDoCliente;
		}
		public void setNomeDoCliente(String nomeDoCliente) {
			this.nomeDoCliente = nomeDoCliente;
		}
	}