package Model;

import java.time.LocalDate;

public class Doador_PFisica extends Pessoa{
		
	public Doador_PFisica(String nome, String endereco, LocalDate dataCadastro, String telefone, String telefone2, String email) {
		super(nome, endereco, dataCadastro, telefone, telefone2, email);
	}
	
	public Doador_PFisica(String nome, String endereco, LocalDate dataCadastro, String telefone, String telefone2, String email, String cpf, long rg, LocalDate dataNascimento) {
		super(nome, endereco, dataCadastro, telefone, telefone2, email);
		
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}
	private String cpf;
	private long rg;
	private LocalDate dataNascimento;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
}
