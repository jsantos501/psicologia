package br.com.ajs.mcs.model;

import br.com.ajs.mcs.type.CondicaoPagamento;
import br.com.ajs.mcs.type.PeriodicidadePagamento;

public class PacienteVO {

	private String nomePaciente;
	private String dataNascimento;
	private String naturalidadeOndeNasceu;
	private String estadoCivil;
	private String instrucao;
	private String profissao;
	private String dataCadastro;
	private String cpfPaciente;
	private String rgPaciente;


	private String nomePai;
	private String nomeMae;
	private String responsavel;
	private String rgResponsavel;
	private String cpfResponsavel;
	private String nomeConjuge;

	private String enderecoResidencial;
	private String numero;
	private String complemento;
	private String bairro;
	private String municipio;
	private String telefoneParaContato;
	private String telefoneFixo;
	private String email;
	private String observacao;

	private String diaSsemanaPretendidoParaAtendimento;
	private String horario;

	private CondicaoPagamento condicoesPagamento;

	private PeriodicidadePagamento peridiocidadePagamento;

	private String valorAcordadoEntreAsPartesFoiDeR$;
	private String responsavelFinanceiro;
	private String paciente;
	private String rgResponsavelFinanceiro;
	private String cpfResponsavelFinanceiro;
	private String contatosResponsavelFinanceiro;
	private String assinatura;
	private String dataCadastroResponsavel;
	
	
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNaturalidadeOndeNasceu() {
		return naturalidadeOndeNasceu;
	}
	public void setNaturalidadeOndeNasceu(String naturalidadeOndeNasceu) {
		this.naturalidadeOndeNasceu = naturalidadeOndeNasceu;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getInstrucao() {
		return instrucao;
	}
	public void setInstrucao(String instrucao) {
		this.instrucao = instrucao;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getCpfPaciente() {
		return cpfPaciente;
	}
	public void setCpfPaciente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}
	public String getRgPaciente() {
		return rgPaciente;
	}
	public void setRgPaciente(String rgPaciente) {
		this.rgPaciente = rgPaciente;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getRgResponsavel() {
		return rgResponsavel;
	}
	public void setRgResponsavel(String rgResponsavel) {
		this.rgResponsavel = rgResponsavel;
	}
	public String getCpfResponsavel() {
		return cpfResponsavel;
	}
	public void setCpfResponsavel(String cpfResponsavel) {
		this.cpfResponsavel = cpfResponsavel;
	}
	public String getNomeConjuge() {
		return nomeConjuge;
	}
	public void setNomeConjuge(String nomeConjuge) {
		this.nomeConjuge = nomeConjuge;
	}
	public String getEnderecoResidencial() {
		return enderecoResidencial;
	}
	public void setEnderecoResidencial(String enderecoResidencial) {
		this.enderecoResidencial = enderecoResidencial;
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
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getTelefoneParaContato() {
		return telefoneParaContato;
	}
	public void setTelefoneParaContato(String telefoneParaContato) {
		this.telefoneParaContato = telefoneParaContato;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getDiaSsemanaPretendidoParaAtendimento() {
		return diaSsemanaPretendidoParaAtendimento;
	}
	public void setDiaSsemanaPretendidoParaAtendimento(String diaSsemanaPretendidoParaAtendimento) {
		this.diaSsemanaPretendidoParaAtendimento = diaSsemanaPretendidoParaAtendimento;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public CondicaoPagamento getCondicoesPagamento() {
		return condicoesPagamento;
	}
	public void setCondicoesPagamento(CondicaoPagamento condicoesPagamento) {
		this.condicoesPagamento = condicoesPagamento;
	}
	public PeriodicidadePagamento getPeridiocidadePagamento() {
		return peridiocidadePagamento;
	}
	public void setPeridiocidadePagamento(PeriodicidadePagamento peridiocidadePagamento) {
		this.peridiocidadePagamento = peridiocidadePagamento;
	}
	public String getValorAcordadoEntreAsPartesFoiDeR$() {
		return valorAcordadoEntreAsPartesFoiDeR$;
	}
	public void setValorAcordadoEntreAsPartesFoiDeR$(String valorAcordadoEntreAsPartesFoiDeR$) {
		this.valorAcordadoEntreAsPartesFoiDeR$ = valorAcordadoEntreAsPartesFoiDeR$;
	}
	public String getResponsavelFinanceiro() {
		return responsavelFinanceiro;
	}
	public void setResponsavelFinanceiro(String responsavelFinanceiro) {
		this.responsavelFinanceiro = responsavelFinanceiro;
	}
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	public String getRgResponsavelFinanceiro() {
		return rgResponsavelFinanceiro;
	}
	public void setRgResponsavelFinanceiro(String rgResponsavelFinanceiro) {
		this.rgResponsavelFinanceiro = rgResponsavelFinanceiro;
	}
	public String getCpfResponsavelFinanceiro() {
		return cpfResponsavelFinanceiro;
	}
	public void setCpfResponsavelFinanceiro(String cpfResponsavelFinanceiro) {
		this.cpfResponsavelFinanceiro = cpfResponsavelFinanceiro;
	}
	public String getContatosResponsavelFinanceiro() {
		return contatosResponsavelFinanceiro;
	}
	public void setContatosResponsavelFinanceiro(String contatosResponsavelFinanceiro) {
		this.contatosResponsavelFinanceiro = contatosResponsavelFinanceiro;
	}
	public String getAssinatura() {
		return assinatura;
	}
	public void setAssinatura(String assinatura) {
		this.assinatura = assinatura;
	}
	public String getDataCadastroResponsavel() {
		return dataCadastroResponsavel;
	}
	public void setDataCadastroResponsavel(String dataCadastroResponsavel) {
		this.dataCadastroResponsavel = dataCadastroResponsavel;
	}
	
	
	
}
