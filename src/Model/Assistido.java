package Model;
import java.time.LocalDate;

import Exceptions.PessoaInvalidaException;
public class Assistido extends Pessoa {
	private String tipoDeCancer;
    private boolean ativo;
    private String apelido;
	
	public Assistido(String nome, String cpf, String endereco, LocalDate dataNascimento, LocalDate dataCadastro,
			String telefone, String telefone2, String rg, String email, String tipoDeCancer, boolean ativo) throws PessoaInvalidaException {
		super(nome, cpf, endereco, dataNascimento, dataCadastro, telefone, telefone2, rg, email);
		setTipoDeCancer(tipoDeCancer);
		setAtivo(ativo);
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
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
}
