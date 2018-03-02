package br.com.ajs.mcs.controler;

import br.com.ajs.mcs.menu.Menu;
import br.com.ajs.mcs.service.IServico;

public class ControllerServices {

	private static IServico servico = null;

	private Menu menu = null;
	
	
	
	
	
	public static IServico getServico() {
		return servico;
	}

	public static void setServico(IServico servico) {
		ControllerServices.servico = servico;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	public void iniciarMenu(){
		setMenu(new Menu());
		getMenu().imprimirMenuPrincipal();
	}
	
	
}
