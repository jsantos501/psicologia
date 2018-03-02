package br.com.ajs.mcs.type;

public enum CondicaoPagamento {

	DINHEIRO("Dinheiro"),
	CARTAO_DE_DEBITO("Cartão de Débito"),
	CARTAO_CREDITO("Cartão de Crédito"),
	DEPOSITO("Depósito");

	private String text;
	CondicaoPagamento(String t){
		text = t;
	}
	
	public String getText() {
		return text;
	}
	
}

