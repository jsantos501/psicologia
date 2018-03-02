package br.com.ajs.mcs.view.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.com.ajs.mcs.type.CondicaoPagamento;
import br.com.ajs.mcs.type.PeriodicidadePagamento;

public class CadastrarDadosPacienteSwing extends JFrame {

	private String mensagemAlerta;
	JButton limpar = new JButton("Limpar");
	JButton cadastrar = new JButton("Cadastrar");

	JTextField nomePaciente = new JTextField();
	JTextField dataNascimento = new JTextField();
	JTextField naturalidadeOndeNasceu = new JTextField();
	JTextField estadoCivil = new JTextField();
	JTextField instrucao = new JTextField();
	JTextField profissao = new JTextField();
	JTextField dataCadastro = new JTextField();
	JTextField cpfPaciente = new JTextField();
	JTextField rgPaciente = new JTextField();

	JTextField nomePai = new JTextField();
	JTextField nomeMae = new JTextField();
	JTextField responsavel = new JTextField();
	JTextField rgResponsavel = new JTextField();
	JTextField cpfResponsavel = new JTextField();
	JTextField nomeConjuge = new JTextField();

	JTextField enderecoResidencial = new JTextField();
	JTextField numero = new JTextField();
	JTextField complemento = new JTextField();
	JTextField bairro = new JTextField();
	JTextField municipio = new JTextField();
	JTextField telefoneParaContato = new JTextField();
	JTextField telefoneFixo = new JTextField();
	JTextField email = new JTextField();
	JTextField observacao = new JTextField();

	JTextField diaSsemanaPretendidoParaAtendimento = new JTextField();
	JTextField horario = new JTextField();

	ButtonGroup condicoesPagamento = new ButtonGroup();

	ButtonGroup peridiocidadePagamento = new ButtonGroup();

	JTextField valorAcordadoEntreAsPartesFoiDeR$ = new JTextField();
	JTextField responsavelFinanceiro = new JTextField();
	JTextField paciente = new JTextField();
	JTextField rgResponsavelFinanceiro = new JTextField();
	JTextField cpfResponsavelFinanceiro = new JTextField();
	JTextField contatosResponsavelFinanceiro = new JTextField();
	JTextField assinatura = new JTextField();
	JTextField dataCadastroResponsavel = new JTextField();

	public CadastrarDadosPacienteSwing() {

		super("Cadastro de dados do paciente");

		montandoCamposFormulario();
	
		}

	private void montandoCamposFormulario() {
		Container container = getContentPane();

		container.setLayout(new GridLayout(20, 4));

		container.add(new JLabel("Nome do paciente:"));
		container.add(nomePaciente);

		container.add(new JLabel("Data de nascimento:"));
		container.add(dataNascimento);

		container.add(new JLabel("Naturalidade(onde nasceu):"));
		container.add(naturalidadeOndeNasceu);

		container.add(new JLabel("Estado civil:"));
		container.add(estadoCivil);

		container.add(new JLabel("instrução:"));
		container.add(instrucao);

		container.add(new JLabel("profissão:"));
		container.add(profissao);

		container.add(new JLabel("data de cadastro:"));
		container.add(dataCadastro);

		container.add(new JLabel("cpf do paciente:"));
		container.add(cpfPaciente);

		container.add(new JLabel("rg do paciente:"));
		container.add(rgPaciente);

		container.add(new JLabel("nome do pai:"));
		container.add(nomePai);

		container.add(new JLabel("nome da mãe:"));
		container.add(nomeMae);

		container.add(new JLabel("responsavel:"));
		container.add(responsavel);

		container.add(new JLabel("rg do responsavel:"));
		container.add(rgResponsavel);

		container.add(new JLabel("cpf do responsavel:"));
		container.add(cpfResponsavel);

		container.add(new JLabel("nome do conjuge:"));
		container.add(nomeConjuge);

		container.add(new JLabel("endereço residencial:"));
		container.add(enderecoResidencial);

		container.add(new JLabel("numero:"));
		container.add(numero);

		container.add(new JLabel("complemento:"));
		container.add(complemento);

		container.add(new JLabel("bairro:"));
		container.add(bairro);

		container.add(new JLabel("municipio:"));
		container.add(municipio);

		container.add(new JLabel("telefone para contato:"));
		container.add(telefoneParaContato);

		container.add(new JLabel("telefone fixo:"));
		container.add(telefoneFixo);

		container.add(new JLabel("e-mail:"));
		container.add(email);

		container.add(new JLabel("observação:"));
		container.add(observacao);

		container.add(new JLabel("dia de semana pretendido para atendimento:"));
		container.add(diaSsemanaPretendidoParaAtendimento);

		container.add(new JLabel("horario:"));
		container.add(horario);

		JRadioButton dinheiro = new JRadioButton(CondicaoPagamento.DINHEIRO.getText());
		JRadioButton cartaoDebito = new JRadioButton(CondicaoPagamento.CARTAO_DE_DEBITO.getText());
		JRadioButton cartaoCredito = new JRadioButton(CondicaoPagamento.CARTAO_CREDITO.getText());
		JRadioButton deposito = new JRadioButton(CondicaoPagamento.DEPOSITO.getText());

		condicoesPagamento.add(dinheiro);
		condicoesPagamento.add(cartaoDebito);
		condicoesPagamento.add(cartaoCredito);
		condicoesPagamento.add(deposito);
	
		JPanel painelCondicoesPagamento = new JPanel();
		painelCondicoesPagamento.setLayout(new BoxLayout(painelCondicoesPagamento, BoxLayout.LINE_AXIS));
		painelCondicoesPagamento.add(dinheiro);
		painelCondicoesPagamento.add(cartaoDebito);
		painelCondicoesPagamento.add(cartaoCredito);
		painelCondicoesPagamento.add(deposito);
		
		container.add(new JLabel("Condição de pagamento:"));
		container.add(painelCondicoesPagamento, BorderLayout.EAST);

		 
		 	JRadioButton primeiraSessaoMes = new JRadioButton(PeriodicidadePagamento.PRIMEIRA_SESSAO_MES.getText());
			JRadioButton ultimaSessaoMes = new JRadioButton(PeriodicidadePagamento.ULTIMA_SESSAO_MES.getText());
			JRadioButton porSessao = new JRadioButton(PeriodicidadePagamento.POR_SESSAO.getText());

			peridiocidadePagamento.add(primeiraSessaoMes);
			peridiocidadePagamento.add(ultimaSessaoMes);
			peridiocidadePagamento.add(porSessao);
		
			JPanel painelPeriodicidadePagamento = new JPanel();
			painelPeriodicidadePagamento.setLayout(new BoxLayout(painelPeriodicidadePagamento, BoxLayout.LINE_AXIS));
			painelPeriodicidadePagamento.add(primeiraSessaoMes);
			painelPeriodicidadePagamento.add(ultimaSessaoMes);
			painelPeriodicidadePagamento.add(porSessao);
			
			container.add(new JLabel("Periodicidade de pagamento:"));
			container.add(painelPeriodicidadePagamento, BorderLayout.EAST);

		 
		 
		 
		 container.add(new JLabel("valor acordado entre as partes foi de R$:"));
		container.add(valorAcordadoEntreAsPartesFoiDeR$);

		container.add(new JLabel("responsavel financeiro:"));
		container.add(responsavelFinanceiro);

		container.add(new JLabel("paciente:"));
		container.add(paciente);

		container.add(new JLabel("rg responsavel:"));
		container.add(rgResponsavelFinanceiro);

		container.add(new JLabel("cpf responsavel financeiro:"));
		container.add(cpfResponsavelFinanceiro);

		container.add(new JLabel("contatos responsavel financeiro:"));
		container.add(contatosResponsavelFinanceiro);

		container.add(new JLabel("assinatura:"));
		container.add(assinatura);

		container.add(new JLabel("data do cadastro do responsavel:"));
		container.add(dataCadastroResponsavel);

		container.add(cadastrar);// add o botão ok no conteiner
		container.add(limpar);// add o botão cancelar no conteiner

		cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(validaFormularioPreenchidoCorretamente()){
					//cadastraNovoPaciente();
					JOptionPane.showMessageDialog(null,mensagemAlerta);

				}else{
				
					JOptionPane.showMessageDialog(null,mensagemAlerta);

				}
				
								// selectionButtonPressed();
			}
		});
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparTodosCampos();
				
				nomePaciente.setText("");

				dataNascimento.setText("");
				// selectionButtonPressed();
			}
		});

		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
	}

	private boolean verificaJTextFieldPreenchida(JTextField jTextField,Boolean flag){
		if(jTextField == null){
			mensagemAlerta += "campo não identificado está vazio.\n";
			return flag = false;
		}else{
			String s = jTextField.getText();
			if(s != null && !s.trim().equals("")){
				return flag;
			}else{
				mensagemAlerta += "campo '"+jTextField.getName()+"' não preenchido.\n";
				return flag = false;
			}
		
		}
	}
	
	boolean validaFormularioPreenchidoCorretamente(){
		Boolean flag = true;
		mensagemAlerta = "";
		
		verificaJTextFieldPreenchida(nomePaciente,flag);
		
		verificaJTextFieldPreenchida(dataNascimento,flag);
		verificaJTextFieldPreenchida(naturalidadeOndeNasceu,flag);
		verificaJTextFieldPreenchida(estadoCivil,flag);
		verificaJTextFieldPreenchida(instrucao,flag);
		verificaJTextFieldPreenchida(profissao,flag);
		verificaJTextFieldPreenchida(dataCadastro,flag);
		verificaJTextFieldPreenchida(cpfPaciente,flag);
		verificaJTextFieldPreenchida(rgPaciente,flag);

		verificaJTextFieldPreenchida(nomePai,flag);
		verificaJTextFieldPreenchida(nomeMae,flag);
		verificaJTextFieldPreenchida(responsavel,flag);
		verificaJTextFieldPreenchida(rgResponsavel,flag);
		verificaJTextFieldPreenchida(cpfResponsavel,flag);
		verificaJTextFieldPreenchida(nomeConjuge,flag);

		verificaJTextFieldPreenchida(enderecoResidencial,flag);
		verificaJTextFieldPreenchida(numero,flag);
		verificaJTextFieldPreenchida(complemento,flag);
		verificaJTextFieldPreenchida(bairro,flag);
		verificaJTextFieldPreenchida(municipio,flag);
		verificaJTextFieldPreenchida(telefoneParaContato,flag);
		verificaJTextFieldPreenchida(telefoneFixo,flag);
		verificaJTextFieldPreenchida(email,flag);
		verificaJTextFieldPreenchida(observacao,flag);

		verificaJTextFieldPreenchida(diaSsemanaPretendidoParaAtendimento,flag);
		verificaJTextFieldPreenchida(horario,flag);

//		ButtonGroupcondicoesPagamento=newButtonGroup();

//		ButtonGroupperidiocidadePagamento=newButtonGroup();

		verificaJTextFieldPreenchida(valorAcordadoEntreAsPartesFoiDeR$,flag);
		verificaJTextFieldPreenchida(responsavelFinanceiro,flag);
		verificaJTextFieldPreenchida(paciente,flag);
		verificaJTextFieldPreenchida(rgResponsavelFinanceiro,flag);
		verificaJTextFieldPreenchida(cpfResponsavelFinanceiro,flag);
		verificaJTextFieldPreenchida(contatosResponsavelFinanceiro,flag);
		verificaJTextFieldPreenchida(assinatura,flag);
		verificaJTextFieldPreenchida(dataCadastroResponsavel,flag);

		
		
		return flag.booleanValue();
	}
	
	private void limparTodosCampos(){
		
	}
	public static void main(String[] args) {
		new CadastrarDadosPacienteSwing();
	}
}
