package entity;

public class Proprietario {
	
	//Atributos
	protected String nomeProprietario;
	protected int telefoneProprietario;
	
	//Construtor
	public Proprietario() {
		super();
	}
	
	public Proprietario(String nomeProprietario, int telefoneProprietario) {
		this.nomeProprietario = nomeProprietario;
		this.telefoneProprietario = telefoneProprietario;
	}
	
	//Getters e Setters
	public String getNomeProprietario() { //Coleta o Atributo
		return nomeProprietario;
	}
	
	public void setNomeProprietario(String nomeProprietario) { //Escrita do Atributo
		this.nomeProprietario = nomeProprietario;
	}
	public int getTelefoneProprietario() { 
		return telefoneProprietario;
	}
	
	public void setTelefoneProprietario(int telefoneProprietario) { 
		this.telefoneProprietario = telefoneProprietario;
	}
	
	public void AtualizarProprietario() {
		
	}
	
	public void ExcluirProprietario() {
		
	}
	
	public void InserirProprietario() {
		
	}
	
	public void PesquisarProprietario() {
		
	}
	
}
