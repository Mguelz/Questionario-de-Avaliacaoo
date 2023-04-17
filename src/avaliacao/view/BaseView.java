package avaliacao.view;

import avaliacao.util.LeitorDeDados;

public class BaseView extends MensagemView{
	private final int SAIR = 0;
	private final int CADASTRAR = 1;
	private final int LOGAR = 2;
	private final int INFORMACOES = 3;

	public void inicializacaoSistema() {
		selecao();

	}

	public void menuOpcoes() {
		lnPrintaMensagem("--------------- Tela Inicial ---------------");
		printaMensagemLn("Voce deseja:");
		printaMensagem(CADASTRAR + " - Cadastrar");
		printaMensagem(LOGAR + " - Login");
		printaMensagem(INFORMACOES + " - Informações");
		printaMensagemLn(SAIR + " - Sair");
	}

	public void selecao() {
		LeitorDeDados scanner = new LeitorDeDados();

		int escolhaMenu;
		do {
			menuOpcoes();
			escolhaMenu = scanner.pegarIntDigitado();
			switch (escolhaMenu) {
			case CADASTRAR: {
				lnPrintaMensagem("cadastrando"); // TODO vai de alguma forma chamar o banco de dados
				break;
			}
			case LOGAR: {
				lnPrintaMensagem("logando"); // TODO vai analizar o banco de dados e autenticar o usuario
				logarSistema();
				break;
			}
			case SAIR: {
				lnPrintaMensagem("saindo");
				break;
			}
			case INFORMACOES: {
				informacoesSistema();
				break;
			}
			default:
				lnPrintaMensagem("escolha uma opcao correta!");
			}

		} while (escolhaMenu != SAIR);

		scanner.close();
	}

	public void informacoesSistema() {
		lnPrintaMensagem("--------------- Tela de Informações ---------------");
		printaMensagem("O usuario irá se logar no sistema");
		printaMensagem("Se caso não estiver conta cadastrado, pode cadastrar-se no sistema com seu cpf");
		printaMensagem("Logo após será direcionado a uma tela para avaliação do atendimento");
		printaMensagem("Pode ou não utilizar o comentario para complementar sua avaliação");
		printaMensagem(
				"Logo após sua avaliação o sistema será capaz de calcular a média de todas as avaliações ja registradas");
		printaMensagem("O adm tem o poder de resetar todas as avaliações");
		printaMensagem("Mas terá que ter um sistema de historico, e média de todos os históricos (se possível)");
	}

	public void logarSistema() {
		LeitorDeDados scanner = new LeitorDeDados();
		String cpf, login, senha;

		lnPrintaMensagem("--------------- Tela de login ---------------");
		printaMensagem("Digite seu CPF cadastrado");
		cpf = scanner.pegartextoCurto();
		printaMensagem("Digite seu LOGIN cadastrado");
		login = scanner.pegartextoCurto();
		printaMensagem("Digite sua SENHA cadastrada");
		senha = scanner.pegartextoCurto();

	}

	public void cadastroSistema() {
		LeitorDeDados scanner = new LeitorDeDados();
		String cpf, login, senha;

		lnPrintaMensagem("--------------- Tela de cadastro ---------------");
		printaMensagem("Digite seu CPF para cadastro");
		cpf = scanner.pegartextoCurto();
		printaMensagem("Digite seu CPF para cadastro");
		login = scanner.pegartextoCurto();
		printaMensagem("Digite seu CPF para cadastro");
		senha = scanner.pegartextoCurto();

	}
}
