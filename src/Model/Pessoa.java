package Model;

import java.time.LocalDate;

import Exceptions.PessoaInvalidaException;

public abstract class Pessoa {
	
	private int idPessoa;
	private String nome;
	private String email;
	private String endereco;
	private String telefone1;
	private String telefone2;
	private LocalDate dataCadastro;
	
	public Pessoa(String nome, String endereco, String telefone1, String telefone2, LocalDate dataCadastro, String email) {
		super();
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.dataCadastro = dataCadastro;
	}
	
	public void realizarDoacao(double valor){
		
	}
	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) throws PessoaInvalidaException {
		if(idPessoa < 0) {
			throw new PessoaInvalidaException("O id informado é inválido");
		}
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws PessoaInvalidaException{
		if(nome == null) {
			throw new PessoaInvalidaException("O nome informado é inválido");
		}
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
}
