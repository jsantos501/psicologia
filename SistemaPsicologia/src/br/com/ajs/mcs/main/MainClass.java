package br.com.ajs.mcs.main;

import br.com.ajs.mcs.controler.ControllerServices;

public class MainClass {

	public static void main(String args[]) {
		while (true) {
			System.out.println("começo do sistema");
			System.out.println("classe principal - SISTEMA DE PSICOLOGIA CLINICA");
			ControllerServices controle = new ControllerServices();
			controle.iniciarMenu();

			System.out.println("servico escolhido :" + ControllerServices.getServico());
			System.out.println("fim do sistema");
		}
	}

}
