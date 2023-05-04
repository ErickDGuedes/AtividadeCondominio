package control;

import entity.Apartamento;
import entity.CondominioApartamento;
import entity.Proprietario;
import entity.TipoDespesa;
import entity.TipoOcupacao;
import interfaces.CalculosPagamento;

public class Operacoes implements CalculosPagamento {
	
	public Operacoes() {
		super();
	}
	
    public void ManterApartamento(Apartamento apto, TipoOcupacao ocup) { 
    	//Operações para Gravar, Atualizar e Excluir os dados do Apartamento e do Proprietário
    	
	}
	
	public void LancamentoDespesas(Proprietario prop, TipoDespesa des) {
		//Operações para calcular os valores das despesas dos Proprietarios
		
	}
	
	public void PagamentoCondominio(Apartamento apto, CondominioApartamento despesas) {
		//Operações para calcular os valores das despesas do condominio
		
	}
	
	@Override
	public double Pagamento(double despesas) { //Pagamento Atrasado
		CondominioApartamento con = new CondominioApartamento();
		double valor = con.getMulta();
		return valor * 0.2 + valor;
	}

	@Override
	public double Pagamento(String nomeProp, double despesas) { //Pagamento para Próximo Mês
		CondominioApartamento con = new CondominioApartamento();
		nomeProp = " ";
		double valor = con.getMulta();
		return valor * 0.5 + valor;
	}

}
