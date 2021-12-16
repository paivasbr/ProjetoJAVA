package POO1;

	public abstract class Telefone {
	//atributos 
		private String tipo; 
	//atributos abstratos
		abstract public void disca(String numero);
		abstract public void toca(int numToques);
	
	//construtor
	public Telefone(String tipo) {
		this.tipo = tipo;
		}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
	
