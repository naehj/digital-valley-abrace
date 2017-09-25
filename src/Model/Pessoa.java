package Model;

import java.time.LocalDate;

public abstract class Pessoa {
	private String nome;
	private String endereco;
	private LocalDate dataCadastro;
	private String telefone;
	private String telefone2;
	private String email;

	
	public Pessoa(String nome, String endereco, LocalDate dataCadastro, String telefone, String telefone2, String email) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.dataCadastro = dataCadastro;
		this.telefone = telefone;
		this.telefone2 = telefone2;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
