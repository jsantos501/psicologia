package br.com.ajs.mcs.model;

import java.util.List;

public class ControleAtendimentoPacienteVO {

	
	private String cliente;
	private String telefones;
	private String endereço;
	private String numero;
	private String complemento;
	private String dataNascimento;
	private String estadoCivil;
	private String responsavelFinanceiro;
	private String conjuge;
	private String nomeConvenio;
	private String numeroIdentificacaoConvvenio;
	private String cid;
	private String dataInicio;
	private String encerramento;
	private String observacoesGerais;
	
	
	private List<ControlePresencaPaciente> listaControlePresencaPaciente;


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getTelefones() {
		return telefones;
	}


	public void setTelefones(String telefones) {
		this.telefones = telefones;
	}


	public String getEndereço() {
		return endereço;
	}


	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public String getResponsavelFinanceiro() {
		return responsavelFinanceiro;
	}


	public void setResponsavelFinanceiro(String responsavelFinanceiro) {
		this.responsavelFinanceiro = responsavelFinanceiro;
	}


	public String getConjuge() {
		return conjuge;
	}


	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}


	public String getNomeConvenio() {
		return nomeConvenio;
	}


	public void setNomeConvenio(String nomeConvenio) {
		this.nomeConvenio = nomeConvenio;
	}


	public String getNumeroIdentificacaoConvvenio() {
		return numeroIdentificacaoConvvenio;
	}


	public void setNumeroIdentificacaoConvvenio(String numeroIdentificacaoConvvenio) {
		this.numeroIdentificacaoConvvenio = numeroIdentificacaoConvvenio;
	}


	public String getCid() {
		return cid;
	}


	public void setCid(String cid) {
		this.cid = cid;
	}


	public String getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}


	public String getEncerramento() {
		return encerramento;
	}


	public void setEncerramento(String encerramento) {
		this.encerramento = encerramento;
	}


	public String getObservacoesGerais() {
		return observacoesGerais;
	}


	public void setObservacoesGerais(String observacoesGerais) {
		this.observacoesGerais = observacoesGerais;
	}


	public List<ControlePresencaPaciente> getListaControlePresencaPaciente() {
		return listaControlePresencaPaciente;
	}


	public void setListaControlePresencaPaciente(List<ControlePresencaPaciente> listaControlePresencaPaciente) {
		this.listaControlePresencaPaciente = listaControlePresencaPaciente;
	}
	
	
	
	
	
}
