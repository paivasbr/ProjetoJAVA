package POO;

import java.text.NumberFormat;

public class ProdutoEletronico {
		private String tipoDoProduto;
		private double valorDoProduto;
	
	public ProdutoEletronico (String t,double v) {
		this.setTipoDoProduto(t);
		this.setValorDoProduto(v);
	}
	public String getTipoDoProduto() {
		return tipoDoProduto;
	}
	public void setTipoDoProduto(String tipoDoProduto) {
		this.tipoDoProduto = tipoDoProduto;
	}
	public double getValorDoProduto() {
		return valorDoProduto;
	}
	public void setValorDoProduto(double valorDoProduto) {
		this.valorDoProduto = valorDoProduto;
	}
	public void aumentoNoValorDoProduto(double inflaçãoNovBrasilIBGE) {
		valorDoProduto = ((1+0.0084)*(1+0.0095)-1)*100;
	}
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valorDoProduto);
		return formatoMoeda;
	}
	void imprimir() {
		System.out.println("\n"+tipoDoProduto+"\t\t"+"valorDoProduto: "+this.formatarMoeda());
	}
}
