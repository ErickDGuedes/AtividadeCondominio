package entity;

public class TipoOcupacao extends Apartamento{
	
	//Atributos
	protected String proprietario;
	protected String inquilino;
	protected String vazio;
	
	//Construtor
	public TipoOcupacao() {
		super();
	}
	
	public TipoOcupacao(String proprietario, String inquilino, String vazio) {
		this.proprietario = proprietario;
		this.inquilino = inquilino;
		this.vazio = vazio;
	}
	//Getters e Setters
	public String getProprietario() { //Coleta o Atributo
		return proprietario;
	}
	
	public void setProprietario(String proprietario) { //Escrita do Atributo
		this.proprietario = proprietario;
	}
	
	public String getInquilino() {
		return inquilino;
	}
	
	public void setInquilino(String inquilino) {
		this.inquilino = inquilino;
	}
	
	public String getVazio() {
		return vazio;
	}
	
	public void setVazio(String vazio) {
		this.vazio = vazio;
	}

}
