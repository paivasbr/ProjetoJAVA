package POO;

import java.text.NumberFormat;

public class Paciente {
	private String nomeDoPaciente;
	private double valorDoQuartoHospitalar;
	
	public Paciente (String n, double v) {
		this.setNomeDoPaciente(n);
		this.setValorDoQuartoHospitalar(v);
	}
	public String getNomeDoPaciente() {
		return nomeDoPaciente;
	}
	public void setNomeDoPaciente(String nomeDoPaciente) {
		this.nomeDoPaciente = nomeDoPaciente;
	}
	public double getValorDoQuartoHospitalar() {
		return valorDoQuartoHospitalar;
	}
	public void setValorDoQuartoHospitalar(double valorDoQuartoHospitalar) {
		this.valorDoQuartoHospitalar = valorDoQuartoHospitalar;
	}
	
	public void aumentarValorHospitalar(double percentual) {
		valorDoQuartoHospitalar*=1+percentual/10;
	}
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valorDoQuartoHospitalar);
		return formatoMoeda;
	}
	public void imprimir() {
		System.out.println("\n"+nomeDoPaciente+"\t\t"+"Salário: "+this.formatarMoeda());
	}
}
