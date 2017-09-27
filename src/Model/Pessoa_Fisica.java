package Model;

import java.time.LocalDate;
import Exceptions.PessoaInvalidaException;

public class Pessoa_Fisica extends Pessoa{
		
	private String cpf;
	private long rg;
	private LocalDate dataNascimento;
	
	public Pessoa_Fisica(String nome, String endereco, String telefone1, String telefone2, LocalDate dataCadastro, String email) {
		super(nome, endereco, telefone1, telefone2, dataCadastro, email);
	}

	public Pessoa_Fisica(String email, String endereco, String telefone1, String telefone2, LocalDate dataCadastro, int id, String nome, String cpf, long rg, LocalDate dataNascimento) {
		super(nome, endereco, telefone1, telefone2, dataCadastro, email);
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
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
	
	public long getRg() {
		return rg;
	}
	public void setRg(long rg) throws PessoaInvalidaException{
		if(rg == 0) {
			throw new PessoaInvalidaException("O RG informado é inválido");
		}
		this.rg = rg;
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

}
