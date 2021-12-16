package POO;
//definição da classe (class)
	public class Clientes {

	/*Objeto = Algo que pode ser sentido e descrito por suas características;
	 * Classe = cria um objeto;
	 * Atributos/ações = características da classe;
	 */	
		//atributos da classe:
			private String nomeDoCliente;
			private String contatoDoCliente;
			private String cidadeDoCliente;
			private String perfilDoCliente;
		 
		//(construtor referencia ao objeto criado na main)A
	public Clientes (String nomeDoCliente,String contatoDoCliente,
		String cidadeDoCliente,String perfilDoCliente) {
		
		  this.nomeDoCliente = nomeDoCliente;
		  this.contatoDoCliente = contatoDoCliente;
		  this.cidadeDoCliente = cidadeDoCliente;
		  this.perfilDoCliente = perfilDoCliente;
	}
	//métodos que manipulam os atributos 
	public void imprimirInfo() {
		System.out.println("\nO(A) cliente: "+nomeDoCliente+", \npossui o(s) seguinte(s) contato(s): email-"+contatoDoCliente+", \na cidade natal do(a) cliente é: "+cidadeDoCliente+", \no(a) cliente possui um perfil: "+perfilDoCliente);
	}
	public String getNomeDoCliente() {
		return nomeDoCliente;
	}
	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
	public String getContatoDoCliente() {
		return contatoDoCliente;
	}
	public void setContatoDoCliente(String contatoDoCliente) {
		this.contatoDoCliente = contatoDoCliente;
	}
	public String getCidadeDoCliente() {
		return cidadeDoCliente;
	}
	public void setCidadeDoCliente(String cidadeDoCliente) {
		this.cidadeDoCliente = cidadeDoCliente;
	}
	public String getPerfilDoCliente() {
		return perfilDoCliente;
	}
	public void setPerfilDoCliente(String perfilDoCliente) {
		this.perfilDoCliente = perfilDoCliente;
	}
}