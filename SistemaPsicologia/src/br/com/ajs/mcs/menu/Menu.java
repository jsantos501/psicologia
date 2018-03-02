package br.com.ajs.mcs.menu;

import java.util.Scanner;

import br.com.ajs.mcs.controler.ControllerServices;
import br.com.ajs.mcs.service.IServico;
import br.com.ajs.mcs.service.ServicoType;

public class Menu {

	private int opcaoPrincipal = -1;
	private int opcaoUsuario = -1;
	
	private Scanner sc = null;

	public void imprimirMenuPrincipal() {
		System.out.println("sistema de psicologia");
		System.out.println("opções do menu PRINCIPAL");
		
		System.out.println("1-manter paciente");
		System.out.println("2-manter psicologo");
		System.out.println("3-manter agenda");
		System.out.println("4-manter usuarios do sistema");
		System.out.println("5-manter prontuarios");
		System.out.println("6-manter formularios");
		System.out.println("7-manter financeiro");
		
		System.out.println("9-sair");

		System.out.println("\n");
		System.out.print("digite a opção desejada :");

		sc = new Scanner(System.in);
		this.setOpcaoPrincipal(validaOpcaoNumerica(sc.nextLine()));
		
		buscaProximoMenu(MenuType.PRINCIPAL, this.getOpcaoPrincipal());
	}

	public void imprimirMenuPaciente() {
		System.out.println("sistema de psicologia");
		System.out.println("opções do menu PACIENTE");
		System.out.println("1-cadastrar dados");
		System.out.println("2-atualizar dados");
		System.out.println("3-consultar pacientes");
		System.out.println("4-inativar paciente");
		System.out.println("5-controle de atendimentos do paciente");
		System.out.println("6-upload de documentos do paciente");
		System.out.println("9-voltar");
		
		System.out.println("\n");
		System.out.print("digite a opção desejada :");

		this.setOpcaoUsuario(validaOpcaoNumerica(sc.nextLine()));
		buscaProximoMenu(MenuType.PACIENTE, this.getOpcaoUsuario());
	}

	public void imprimirMenuFormularios() {
		System.out.println("sistema de psicologia");
		System.out.println("opções do menu Formularios");
		System.out.println("1-formulario de cadastro cliente");
		System.out.println("2-formulario de prontuario");
		System.out.println("3-formulario de controle de atendimento");
		System.out.println("4-contrato de adesao de terapia");
		System.out.println("5-recibo de pagamento");
		System.out.println("9-voltar");
		
		System.out.println("\n");
		System.out.print("digite a opção desejada :");

		this.setOpcaoUsuario(validaOpcaoNumerica(sc.nextLine()));
		buscaProximoMenu(MenuType.FORMULARIOS, this.getOpcaoUsuario());
	}
	
	
	public void imprimirMenuFinanceiro() {
		System.out.println("sistema de psicologia");
		System.out.println("opções do menu Formularios");
		System.out.println("1-balanço do mes atual");
		System.out.println("2-extrato por periodo");
		System.out.println("3-sessões pendente de recebimento");
		System.out.println("4-sessões pendente de atendimento");
		System.out.println("9-voltar");
		
		System.out.println("\n");
		System.out.print("digite a opção desejada :");

		this.setOpcaoUsuario(validaOpcaoNumerica(sc.nextLine()));
		buscaProximoMenu(MenuType.FORMULARIOS, this.getOpcaoUsuario());
	}
	
	public void imprimirMenuPsicologo() {
		System.out.println("sistema de psicologia");
		System.out.println("opções do menu PSICOLOGO");
		System.out.println("1-cadastrar dados");
		System.out.println("2-atualizar dados");
		System.out.println("3-consultar psicologos");
		System.out.println("4-inativar psicologo");
		System.out.println("9-voltar");
		System.out.println("\n");
		System.out.print("digite a opção desejada :");

		this.setOpcaoUsuario(validaOpcaoNumerica(sc.nextLine()));
	
		buscaProximoMenu(MenuType.PSICOLOGO, this.getOpcaoUsuario());
	}

	public void imprimirMenuAgendamento() {
		System.out.println("sistema de psicologia");
		System.out.println("opções do menu AGENDAMENTO");
		System.out.println("1-cadastrar agendamento");
		System.out.println("2-atualizar agendamento");
		System.out.println("3-consultar agendamentos");
		System.out.println("4-cancelar agendamento");
		System.out.println("9-voltar");
		
		System.out.println("\n");
		System.out.print("digite a opção desejada :");

		this.setOpcaoUsuario(validaOpcaoNumerica(sc.nextLine()));
	
		buscaProximoMenu(MenuType.AGENDA, this.getOpcaoUsuario());
	}

	public void imprimirMenuUsuario() {
		System.out.println("sistema de psicologia");
		System.out.println("opções do menu USUARIOS DO SISTEMA");
		System.out.println("1-cadastrar dados");
		System.out.println("2-atualizar dados");
		System.out.println("3-consultar usuarios");
		System.out.println("4-inativar usuario");
		System.out.println("9-voltar");
		
		System.out.println("\n");
		System.out.print("digite a opção desejada :");

		this.setOpcaoUsuario(validaOpcaoNumerica(sc.nextLine()));

		buscaProximoMenu(MenuType.USUARIOS, this.getOpcaoUsuario());
		
	}

	public void imprimirMenuProntuario() {
		System.out.println("sistema de psicologia");
		System.out.println("opções do menu PRONTUARIO");
		System.out.println("1-cadastrar dados");
		System.out.println("2-atualizar dados");
		System.out.println("3-consultar prontuarios");
		System.out.println("4-inativar prontuario");
		System.out.println("9-voltar");
		
		System.out.println("\n");
		System.out.print("digite a opção desejada :");

		this.setOpcaoUsuario(validaOpcaoNumerica(sc.nextLine()));
		buscaProximoMenu(MenuType.PRONTUARIO, this.getOpcaoUsuario());
	}

	
	
	private void buscaProximoMenu(MenuType menuOrigem, int opcaoMenu) {
		
		switch (menuOrigem) {
		case PRINCIPAL:
			switch (opcaoMenu) {
			case 1:
				imprimirMenuPaciente();
				break;
			case 2:
				imprimirMenuPsicologo();
				break;
			case 3:
				imprimirMenuAgendamento();
				break;
			case 4:
				imprimirMenuUsuario();
				break;
			case 5:
				imprimirMenuProntuario();
				break;
			case 6:
				imprimirMenuFormularios();
				break;
			case 7:
				imprimirMenuFinanceiro();
				break;
				case 9:
				System.out.println("obrigado por utilizar o sistema de psicologia clinica");
				break;

			default:
				System.out.println("opção " + opcaoMenu + " invalida, por favor, tente novamente.");
				imprimirMenuPrincipal();
			}
			break;
		default:
		
			if(validaOpcaoEscolhida(menuOrigem,opcaoMenu)){
				ControllerServices.setServico(ServicoType.obterServicoMenu(menuOrigem,opcaoMenu));
			}

		}
	}

	private boolean validaOpcaoEscolhida(MenuType menuOrigem, int om){
		boolean flag = false;
		
		if(	(menuOrigem.equals(MenuType.PRINCIPAL) && om < 8) 
			|| (ServicoType.hasServicoEscolhido( menuOrigem, om)) ){
			flag = true;
			return flag;		
		}else if(om == 9){
			System.out.println("voltando para o menu principal");
			imprimirMenuPrincipal();
			return flag;		
		}else{
			System.out.println("opção " + om + " invalida, por favor, tente novamente.");
				
			switch (menuOrigem) {
				case PRINCIPAL:
					imprimirMenuPrincipal();break;
				case PACIENTE:
					imprimirMenuPaciente();break;
				case PSICOLOGO:
					imprimirMenuPsicologo();break;
				case AGENDA:
					imprimirMenuAgendamento();break;
				case USUARIOS:
					imprimirMenuUsuario();break;
				case FORMULARIOS:
					imprimirMenuFormularios();break;
				case FINANCEIRO:
					imprimirMenuFinanceiro();break;
				case PRONTUARIO:
					imprimirMenuProntuario();break;
			}
		}
		return flag;

	}

	
	private int validaOpcaoNumerica(String texto){
		try{
			return Integer.parseInt(texto);
		}catch(Exception e){
			
		}
		return 99;
	}

	public int getOpcaoPrincipal() {
		return opcaoPrincipal;
	}

	public void setOpcaoPrincipal(int opcaoPrincipal) {
		this.opcaoPrincipal = opcaoPrincipal;
	}

	public int getOpcaoUsuario() {
		return opcaoUsuario;
	}

	public void setOpcaoUsuario(int opcaoUsuario) {
		this.opcaoUsuario = opcaoUsuario;
	}




}
