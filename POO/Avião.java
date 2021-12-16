package POO;

public class Avi�o {
	/* apresente os atributos e m�todos referentes 
	 * crie um objeto avi�o, 
	 * defina as instancias deste objeto 
	 * apresente as informa��es deste objeto no console.
	 */
	//atributos da classe:
	public String modeloDeAvi�o;
	public String companhiaResponsavel; 
	
	//contrutor: duplica o local de armazenamento onde esta sendo salva o argumentos.
	public Avi�o (String primeiro,String segundo) { 
		this.modeloDeAvi�o = primeiro;
		this.companhiaResponsavel = segundo; 
	}
	void imprimirInfo() {
		System.out.println("\nO modelo do avi�o �: "+modeloDeAvi�o+". \nA companhia respons�vel �: "+companhiaResponsavel+".");
			}
	public String getModeloDeAvi�o() {
		return modeloDeAvi�o;
	}
	public void setModeloDeAvi�o(String modeloDeAvi�o) {
		this.modeloDeAvi�o = modeloDeAvi�o;
	}
	public String getCompanhiaResponsavel() {
		return companhiaResponsavel;
	}
	public void setCompanhiaResponsavel(String companhiaResponsavel) {
		this.companhiaResponsavel = companhiaResponsavel;
		}
	}
