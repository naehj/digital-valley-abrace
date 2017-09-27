package Model;

import java.time.LocalDate;

import Exceptions.FuncionarioInvalidoException;
import Exceptions.PessoaInvalidaException;

public class Funcionario extends Pessoa{
	private String login;
	private String senha;
	
	public Funcionario(int id, String login, String senha) throws FuncionarioInvalidoException, PessoaInvalidaException {
		setId(id);
		setLogin(login);
		setSenha(senha);
	}
	
	public Funcionario(int id, String nome, String login, String senha, String cpf, String endereco, LocalDate dataNascimento, LocalDate dataCadastro, String telefone, String telefone2, String rg, String email,float salario) throws PessoaInvalidaException, FuncionarioInvalidoException {
        super(id, nome, cpf, endereco, dataNascimento, dataCadastro, telefone, telefone2, rg, email);
        setLogin(login);
        setSenha(senha);
    }
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) throws FuncionarioInvalidoException {
		if(login == null) {
			throw new FuncionarioInvalidoException("O login informado é inválido");
		}
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) throws FuncionarioInvalidoException {
		if(senha == null) {
			throw new FuncionarioInvalidoException("A senha informada é inválida");
		}
		this.senha = senha;
	}

}
