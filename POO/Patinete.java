package POO;

import java.text.NumberFormat;

	public class Patinete {
	
		private String modeloDoPatinete;
		private String corDoPatinete;
		private String acessoriosDoPatinete;
	
	public Patinete (String m,String c,String a) {
		this.setModeloDoPatinete(m);
		this.setCorDoPatinete(c);
		this.setAcessoriosDoPatinete(a);
	}
	public String getModeloDoPatinete() {
		return modeloDoPatinete;
	}
	public void setModeloDoPatinete(String modeloDoPatinete) {
		this.modeloDoPatinete = modeloDoPatinete;
	}
	public String getCorDoPatinete() {
		return corDoPatinete;
	}
	public void setCorDoPatinete(String corDoPatinete) {
		this.corDoPatinete = corDoPatinete;
	}
	public String getPre�oDoPatinete() {
		return acessoriosDoPatinete;
	}
	public void setAcessoriosDoPatinete(String acessoriosDoPatinete) {
		this.acessoriosDoPatinete = acessoriosDoPatinete;
	}
	public void imprimirInfo() {
		System.out.println("\nO modelo do Patinete �: "+modeloDoPatinete+". \nA sua cor �: "+corDoPatinete+". \nOs acess�rio que vem junto s�o: "+acessoriosDoPatinete+".");
	}
}
