package Model;

import java.time.LocalDate;

import Exceptions.PessoaInvalidaException;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private LocalDate dataNascimento;
    private LocalDate dataCadastro;
    private String telefone;
    private String telefone2;
    private long rg;
    private String email;
	
    public Pessoa(String nome, String cpf, String endereco, LocalDate dataNascimento, LocalDate dataCadastro,
			String telefone, String telefone2, long rg, String email) throws PessoaInvalidaException{
    	setNome(nome);
    	setCpf(cpf);
    	setEndereco(endereco);
    	setDataNascimento(dataNascimento);
    	setDataCadastro(dataCadastro);
    	setTelefone(telefone);
    	setTelefone2(telefone2);
    	setEmail(email);
    	setRg(rg);
		
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) throws PessoaInvalidaException{
		if(cpf == null) {
			throw new PessoaInvalidaException("O cpf informado é inválido");
		}//Aqui deveria ter um teste para ver se o cpf é valido!!!!
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) throws PessoaInvalidaException{
		if(endereco == null) {
			throw new PessoaInvalidaException("O endereco informado é inválido");
		}
		this.endereco = endereco;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) throws PessoaInvalidaException{
		if(dataNascimento == null || LocalDate.now().isBefore(dataNascimento)) {
			throw new PessoaInvalidaException("A data informada é inválida");
		}
		this.dataNascimento = dataNascimento;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) throws PessoaInvalidaException{
		if(dataCadastro == null) {
			throw new PessoaInvalidaException("A data informada é inválida");
		}
		this.dataCadastro = dataCadastro;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) throws PessoaInvalidaException{
		if(telefone == null) {
			throw new PessoaInvalidaException("O telefone informado é inválido");
		}
		this.telefone = telefone;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) throws PessoaInvalidaException{
		if(telefone2 == null) {
			throw new PessoaInvalidaException("O telefone informado é inválido");
		}
		this.telefone2 = telefone2;
	}
	public long getRg() {
		return rg;
	}
	public void setRg(long rg) throws PessoaInvalidaException{
		if(rg < 0) {
			throw new PessoaInvalidaException("O RG informado é inválido");
		}
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws PessoaInvalidaException{
		if(email == null || !email.contains("@")) {
			throw new PessoaInvalidaException("O e-mail informado é inválido");
		}
		this.email = email;
	}
}
