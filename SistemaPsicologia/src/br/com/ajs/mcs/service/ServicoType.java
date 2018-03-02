package br.com.ajs.mcs.service;

import br.com.ajs.mcs.menu.MenuType;
import br.com.ajs.mcs.service.impl.AtualizarAgendamentoService;
import br.com.ajs.mcs.service.impl.AtualizarDadosPacienteService;
import br.com.ajs.mcs.service.impl.AtualizarDadosProntuarioService;
import br.com.ajs.mcs.service.impl.AtualizarDadosPsicologoService;
import br.com.ajs.mcs.service.impl.AtualizarDadosUsuarioService;
import br.com.ajs.mcs.service.impl.BalancoMesAtualService;
import br.com.ajs.mcs.service.impl.CadastrarAgendamentoService;
import br.com.ajs.mcs.service.impl.CadastrarDadosPacienteService;
import br.com.ajs.mcs.service.impl.CadastrarDadosProntuarioService;
import br.com.ajs.mcs.service.impl.CadastrarDadosPsicologoService;
import br.com.ajs.mcs.service.impl.CadastrarDadosUsuarioService;
import br.com.ajs.mcs.service.impl.CancelarAgendamentoService;
import br.com.ajs.mcs.service.impl.ConsultarAgendamentosService;
import br.com.ajs.mcs.service.impl.ConsultarPacientesService;
import br.com.ajs.mcs.service.impl.ConsultarProntuariosService;
import br.com.ajs.mcs.service.impl.ConsultarPsicologosService;
import br.com.ajs.mcs.service.impl.ConsultarUsuariosService;
import br.com.ajs.mcs.service.impl.ContratoAdesaoTerapiaService;
import br.com.ajs.mcs.service.impl.ControleAtendimentoPaciente;
import br.com.ajs.mcs.service.impl.ExtratoPorPeriodoService;
import br.com.ajs.mcs.service.impl.FormularioCadastroClienteService;
import br.com.ajs.mcs.service.impl.FormularioControleAtendimentoService;
import br.com.ajs.mcs.service.impl.FormularioProntuarioService;
import br.com.ajs.mcs.service.impl.InativarPacienteService;
import br.com.ajs.mcs.service.impl.InativarProntuarioService;
import br.com.ajs.mcs.service.impl.InativarPsicologoService;
import br.com.ajs.mcs.service.impl.InativarUsuarioService;
import br.com.ajs.mcs.service.impl.ReciboPagamentoService;
import br.com.ajs.mcs.service.impl.SessoesPendenteAtendimentoService;
import br.com.ajs.mcs.service.impl.SessoesPendenteRecebimentoService;
import br.com.ajs.mcs.service.impl.UploadDocumentosPacienteService;

public enum ServicoType {

CADASTRAR_DADOS_PACIENTE(MenuType.PACIENTE,1,CadastrarDadosPacienteService.class),
ATUALIZAR_DADOS_PACIENTE(MenuType.PACIENTE,2,AtualizarDadosPacienteService.class),
CONSULTAR_PACIENTE(MenuType.PACIENTE,3,ConsultarPacientesService.class),
INATIVAR_PACIENTE(MenuType.PACIENTE,4,InativarPacienteService.class),
CONTROLE_ATENDIMENTO_PACIENTE(MenuType.PACIENTE,5,ControleAtendimentoPaciente.class),
UPLOAD_DOCUMENTOS_PACIENTE(MenuType.PACIENTE,6,UploadDocumentosPacienteService.class),

CADASTRAR_DADOS_PSICOLOGO(MenuType.PSICOLOGO,1,CadastrarDadosPsicologoService.class),
ATUALIZAR_DADOS_PSICOLOGO(MenuType.PSICOLOGO,2,AtualizarDadosPsicologoService.class),
CONSULTAR_PSICOLOGOS(MenuType.PSICOLOGO,3,ConsultarPsicologosService.class),
INATIVAR_PSICOLOGO(MenuType.PSICOLOGO,4,InativarPsicologoService.class),

CADASTRAR_AGENDAMENTO(MenuType.AGENDA,1,CadastrarAgendamentoService.class),
ATUALIZAR_AGENDAMENTO(MenuType.AGENDA,2,AtualizarAgendamentoService.class),
CONSULTAR_AGENDAMENTOS(MenuType.AGENDA,3,ConsultarAgendamentosService.class),
CANCELAR_AGENDAMENTOS(MenuType.AGENDA,4,CancelarAgendamentoService.class),

CADASTRAR_DADOS_USUARIO(MenuType.USUARIOS,1,CadastrarDadosUsuarioService.class),
ATUALIZAR_DADOS_USUARIO(MenuType.USUARIOS,2,AtualizarDadosUsuarioService.class),
CONSULTAR_USUARIOS(MenuType.USUARIOS,3,ConsultarUsuariosService.class),
INATIVAR_USUARIO(MenuType.USUARIOS,4,InativarUsuarioService.class),	
	
CADASTRAR_DADOS_PRONTUARIO(MenuType.PRONTUARIO,1,CadastrarDadosProntuarioService.class),
ATUALIZAR_DADOS_PRONTUARIO(MenuType.PRONTUARIO,2,AtualizarDadosProntuarioService.class),
CONSULTAR_PRONTUARIOS(MenuType.PRONTUARIO,3,ConsultarProntuariosService.class),
INATIVAR_PRONTUARIO(MenuType.PRONTUARIO,4,InativarProntuarioService.class),

FORMULARIO_CADASTRO_CLIENTE(MenuType.FORMULARIOS,1,FormularioCadastroClienteService.class),
FORMULARIO_PRONTUARIO(MenuType.FORMULARIOS,2,FormularioProntuarioService.class),
FORMULARIO_CONTROLE_ATENDIMENTO(MenuType.FORMULARIOS,3,FormularioControleAtendimentoService.class),
CONTRATO_ADESAO_TERAPIA(MenuType.FORMULARIOS,4,ContratoAdesaoTerapiaService.class),
RECIBO_PAGAMENTO(MenuType.FORMULARIOS,5,ReciboPagamentoService.class),

BALANCO_MES_ATUAL(MenuType.FINANCEIRO,1,BalancoMesAtualService.class),
EXTRATO_POR_PERIODO(MenuType.FINANCEIRO,2,ExtratoPorPeriodoService.class),
SESSOES_PENDENTE_RECEBIMENTO(MenuType.FINANCEIRO,3,SessoesPendenteRecebimentoService.class),
SESSOES_PENDENTE_ATENDIMENTO(MenuType.FINANCEIRO,4,SessoesPendenteAtendimentoService.class);
	
	
	private MenuType menuType;
	private int opcaoEscolhida;
	private Class<? extends ServicoGenerico> servicoMenu;
	
	
	private ServicoType(MenuType m,int op,Class<? extends ServicoGenerico> servico){
		menuType = m;
		opcaoEscolhida = op;
		servicoMenu =  servico;
	}
	
	public MenuType getMenuType() {
		return menuType;
	}

	public int getOpcaoEscolhida() {
		return opcaoEscolhida;
	}

	public Class<? extends ServicoGenerico> getServicoMenu() {
		return servicoMenu;
	}

	public IServico getNewInstance(){
		
		try {
			return (IServico) servicoMenu.newInstance();
		} catch (InstantiationException e) {
			return null;
		} catch (IllegalAccessException e) {
			return null;
		}
	}
	
	
	public static IServico obterServicoMenu(MenuType m, int op){
		
		for(ServicoType st:ServicoType.values()){
			if(m.equals(st.getMenuType()) && op == st.getOpcaoEscolhida()){
				return st.getNewInstance();
			}			
		}
		return null;
	}
	
public static boolean hasServicoEscolhido(MenuType m, int op){
		
		for(ServicoType st:ServicoType.values()){
			if(m.equals(st.getMenuType()) && op == st.getOpcaoEscolhida()){
				return true;
			}			
		}
		return false;
	}
	
	
}
