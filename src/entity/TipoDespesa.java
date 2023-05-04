package entity;

public class TipoDespesa extends Despesas{
	
	//Atributos
	
	protected double fixa;
	protected double avulsa;
	protected double variavel;
	
	//Construtor
	public TipoDespesa() {
		super();
	}
	
	public TipoDespesa(double fixa, double avulsa, double variavel) {
		this.fixa = fixa;
		this.avulsa = avulsa;
		this.variavel = variavel;
	}
	//Getters e Setters
	public double getFixa() { //Coleta do Atributo
		return fixa;
	}
	
	public void setFixa(double fixa) { //Escrita do Atributo
		this.fixa = fixa;
	}
	
	public double getAvulsa() {
		return avulsa;
	}
	
	public void setAvulsa(double avulsa) {
		this.avulsa = avulsa;
	}
	
	public double getVariavel() {
		return variavel;
	}
	
	public void setVariavel(double variavel) {
		this.variavel = variavel;
	}
	
}
