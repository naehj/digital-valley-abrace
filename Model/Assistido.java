package Model;

import java.time.LocalDate;

public class Assistido extends Pessoa {

	private String tipoDeCancer;
	private boolean ativo;

	public Assistido(String nome, String cpf, String endereco, LocalDate dataNascimento, LocalDate dataCadastro,
			String telefone, String telefone2, long rg, String email, String tipoDeCancer, boolean ativo) {
		super(nome, cpf, endereco, dataNascimento, dataCadastro, telefone, telefone2, rg, email);
		this.tipoDeCancer = tipoDeCancer;
		this.ativo = ativo;
	}

	public String getTipoDeCancer() {
		return tipoDeCancer;
	}

	public void setTipoDeCancer(String tipoDeCancer) {
		this.tipoDeCancer = tipoDeCancer;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
