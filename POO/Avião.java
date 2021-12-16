package POO;

public class Avião {
	/* apresente os atributos e métodos referentes 
	 * crie um objeto avião, 
	 * defina as instancias deste objeto 
	 * apresente as informações deste objeto no console.
	 */
	//atributos da classe:
	public String modeloDeAvião;
	public String companhiaResponsavel; 
	
	//contrutor: duplica o local de armazenamento onde esta sendo salva o argumentos.
	public Avião (String primeiro,String segundo) { 
		this.modeloDeAvião = primeiro;
		this.companhiaResponsavel = segundo; 
	}
	void imprimirInfo() {
		System.out.println("\nO modelo do avião é: "+modeloDeAvião+". \nA companhia responsável é: "+companhiaResponsavel+".");
			}
	public String getModeloDeAvião() {
		return modeloDeAvião;
	}
	public void setModeloDeAvião(String modeloDeAvião) {
		this.modeloDeAvião = modeloDeAvião;
	}
	public String getCompanhiaResponsavel() {
		return companhiaResponsavel;
	}
	public void setCompanhiaResponsavel(String companhiaResponsavel) {
		this.companhiaResponsavel = companhiaResponsavel;
		}
	}
