package POO1;

public interface Figuras {
	public String nomeInterface = "Figuras";
	abstract public String getNome();
	abstract public String setNome(String nome);
	public double gerArea();
	public double getPerimetro();
	double getDiagonal();
		
	}
