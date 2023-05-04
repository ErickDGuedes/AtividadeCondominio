package entity;

import java.util.Date;

public class Despesas {
	
	//Atributos
	protected Date referenciaDespesa;
	protected double valorDespesa;
	protected TipoDespesa despesa;
	
	//Construtor
	public Despesas() {
		super();
	}
	
	public Despesas(Date referenciaDespesa, double valorDespesa, TipoDespesa despesa) {
		this.referenciaDespesa = referenciaDespesa;
		this.valorDespesa = valorDespesa;
		this.despesa = despesa;
	}
	//Getters e Setters
	public Date getReferenciaDespesa() { //Coleta do Atributo
		return referenciaDespesa;
	}
	
	public void setReferenciaDespesa(Date referenciaDespesa) { //Escrita do Atributo
		this.referenciaDespesa = referenciaDespesa;
	}
	
	public double getValorDespesa(){
		return valorDespesa;
	}
	
	public void setValorDespesa(double valorDespesa) {
		this.valorDespesa = valorDespesa;
	}
	
	public TipoDespesa getDespesa() {
		return despesa;
	}
	
	public void setDespesa(TipoDespesa despesa) {
		this.despesa = despesa;
	}
	
}
