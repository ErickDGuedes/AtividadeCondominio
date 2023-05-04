package entity;

public class Apartamento extends Proprietario{
	
	//Atributos
	protected int numeroApto;
	protected int qtdeQuartos;
	
	//Construtor
	public Apartamento() {
		super();
	}
	
	public Apartamento(int numeroApto, int qtdQuartos, String nomeProprietario, int telefoneProprietario) {
		this.numeroApto = numeroApto;
		this.qtdeQuartos = qtdQuartos;
		super.setNomeProprietario(nomeProprietario);
		super.setTelefoneProprietario(telefoneProprietario);
		
	}
    //Getters e Setters
	public int getNumero() { //Coleta o Atributo
		return numeroApto;
	}
	
	public void setNumero(int numeroApto) { //Escrita do Atributo
		this.numeroApto = numeroApto;
	}
	
	public int getQtdeQuartos() {
		return qtdeQuartos;
	}
	
	public void setQtdeQuartos(int qtdeQuartos) { 
		this.qtdeQuartos = qtdeQuartos;
	}
	
	public String getNomeProprietario() { 
		return nomeProprietario;
	}
	
	public void setNomeProprietario(String nomeProprietario) { 
		this.nomeProprietario = nomeProprietario;
	}
	public int getTelefoneProprietario() { 
		return telefoneProprietario;
	}
	
	public void setTelefoneProprietario(int telefoneProprietario) { 
		this.telefoneProprietario = telefoneProprietario;
	}
	
	public void AtualizarApartamento() {
		
	}
	
	public void ExcluirApartamento() {
		
	}
	
	public void InserirApartamento() {
		
	}
	
	public void PesquisarApartamento() {
		
	}
}
