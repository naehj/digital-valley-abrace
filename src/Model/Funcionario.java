package Model;

import java.time.LocalDate;

import Exceptions.FuncionarioInvalidoException;
import Exceptions.PessoaInvalidaException;

public class Funcionario extends Pessoa{
	private int id;
	private String login;
	private String senha;
	private float salario;
	
	public Funcionario(String nome, String login, String senha, String cpf, String endereco, LocalDate dataNascimento, LocalDate dataCadastro, String telefone, String telefone2, long rg, String email,float salario) throws FuncionarioInvalidoException, PessoaInvalidaException{
        super(nome, cpf, endereco, dataNascimento, dataCadastro, telefone, telefone2, rg, email);
        setLogin(login);
        setSenha(senha);
        setSalario(salario);
    }
	
	public Funcionario(int id, String nome, String login, String senha, String cpf, String endereco, LocalDate dataNascimento, LocalDate dataCadastro, String telefone, String telefone2, long rg, String email,float salario) throws PessoaInvalidaException, FuncionarioInvalidoException {
        super(nome, cpf, endereco, dataNascimento, dataCadastro, telefone, telefone2, rg, email);
        setId(id);
        setLogin(login);
        setSenha(senha);
        setSalario(salario);
    }
	
	public int getId() {
		return id;
	}

	public void setId(int id) throws FuncionarioInvalidoException {
		if(id < 0) {
			throw new FuncionarioInvalidoException("O id informado é inválido");
		}
		this.id = id;
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

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) throws FuncionarioInvalidoException {
		if(salario < 0) {
			throw new FuncionarioInvalidoException("O salário informado é inválido");
		}
		this.salario = salario;
	}
}
