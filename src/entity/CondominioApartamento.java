package entity;

import java.util.Date;

public class CondominioApartamento {
	
	//Atributos
	protected Date referenciaCondominio;
	protected double valorCondominio;
	protected double multa;
	protected boolean pago;
	protected Apartamento apartamentos;
	
	//Construtor
	public CondominioApartamento() {
		super();
	}
	
	public CondominioApartamento(Date referenciaCondominio, double valorCondominio, double multa, 
		     boolean pago, Apartamento apartamentos) {
		this.referenciaCondominio = referenciaCondominio;
		this.valorCondominio = valorCondominio;
		this.multa = multa;
		this.pago = pago;
		this.apartamentos = apartamentos;
	}
    //Getters e Setters
	public Date getReferenciaCondominio() { //Coleta do Atributo
		return referenciaCondominio;
	}
	
	public double getValorCondominio() {
		return valorCondominio;
	}
	
	public void setValorCondominio(double valorCondominio) {
		this.valorCondominio = valorCondominio;
	}
	
	public double getMulta() {
		return multa;
	}
	
	public void setMulta(double multa) {
		this.multa = multa;
	}
	
	public boolean getPago() {
		if(pago == true) {
			return true;
		}else {
			return false;
		}
	}
	
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
	public Apartamento getApartamentos() {
		return apartamentos;
	}
	
}
