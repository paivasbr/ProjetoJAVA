package POO;

import java.text.NumberFormat;

public class Funcionário {
		private String nomeDoFuncionario;
		private double salarioDoFuncionario;
	
	public Funcionário (String n, double s) {
		this.setNomeDoFuncionario(n);
		this.setSalarioDoFuncionario(s);
	}
	public String getNomeDoFuncionario() {
		return nomeDoFuncionario;
	}
	public void setNomeDoFuncionario(String nomeDoFuncionario) {
		this.nomeDoFuncionario = nomeDoFuncionario;
	}
	public double getSalarioDoFuncionario() {
		return salarioDoFuncionario;
	}
	public void setSalarioDoFuncionario(double salarioDoFuncionario) {
		this.salarioDoFuncionario = salarioDoFuncionario;
	}
	
	public void aumentoDeSalario(double percentual) {
		salarioDoFuncionario*=1+percentual/100;
	}
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salarioDoFuncionario);
		return formatoMoeda;
	}
	public void imprimir() {
		System.out.println("\n"+nomeDoFuncionario+"\t\t"+"Salário: "+this.formatarMoeda());
	}
}
