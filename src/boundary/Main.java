package boundary;

import control.Operacoes;
import entity.Apartamento;
import entity.CondominioApartamento;
import entity.TipoDespesa;
import entity.TipoOcupacao;

public class Main {

	public static void main(String[] args) {
		Operacoes op = new Operacoes();
		
		//Telas
		
		//Manter Apartamento - onde teria as abas: Gravar AP, Atualizar AP e Excluir AP.
		//E funções para pesquisar Apartamentos e Proprietários.
		//Todos Mapeados dentro de ManterApartamento()
		Apartamento apto = new Apartamento();
		TipoOcupacao ocup = new TipoOcupacao();
		apto.setNumero(0);
		apto.setQtdeQuartos(0);
		apto.setNomeProprietario(" Fulano");
		apto.setTelefoneProprietario(0);
		ocup.setInquilino(null);
		op.ManterApartamento(apto, ocup); 
		
		//Lançamento de Despesas - onde teria os campos para preenchimento das despesas de cada Apartamento
		//Mapeados dentro de LancamentoDespesas()
		TipoDespesa des = new TipoDespesa();
		des.setValorDespesa(0);
		des.setVariavel(0);
		apto.setNumero(0);
		des.setReferenciaDespesa(null);
		op.Pagamento(0);
		op.Pagamento(null, 0);
		op.LancamentoDespesas(ocup, des);
		
		//Pagamento do Condomínio - onde teria os campos para preenchimento das despesas do Condomínio
		//Mapeados dentro de PagamentoCondominio()
		CondominioApartamento con = new CondominioApartamento();
		apto.setNumero(0);
		con.getReferenciaCondominio();
		con.setMulta(0);
		op.PagamentoCondominio(apto, con);
		
	}
}