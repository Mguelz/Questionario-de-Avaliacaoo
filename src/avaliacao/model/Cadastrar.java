package avaliacao.model;

import java.util.ArrayList;
import java.util.List;

public class Cadastrar {
	private int cpf;
	private String login;
	private String senha;

	public Cadastrar() {
		List<Cadastrar> cadastrarLista = new ArrayList<Cadastrar>(); // TODO alocar no melhor lugar possível
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
