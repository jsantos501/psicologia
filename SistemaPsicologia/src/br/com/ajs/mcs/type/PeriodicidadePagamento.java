package br.com.ajs.mcs.type;

public enum PeriodicidadePagamento {

	PRIMEIRA_SESSAO_MES("Primeira Sessão do Mês"),
	ULTIMA_SESSAO_MES("Última sessão do Mês"),
	POR_SESSAO("por Sessão");
	
	private String text;
	
	PeriodicidadePagamento(String t){
		text = t;
		
	}

	public String getText() {
		return text;
	}
	
}
