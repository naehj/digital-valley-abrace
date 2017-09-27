package Model;

import java.time.LocalDate;

public class Pessoa_Juridica extends Pessoa{

	private String cnpj;
	private String fantasia;
	
	public Pessoa_Juridica(String nome, String endereco, String telefone1, String telefone2, LocalDate dataCadastro, String email) {
		super(nome, endereco, telefone1, telefone2, dataCadastro, email);
	}

	public Pessoa_Juridica(String nome, String endereco, String telefone1, String telefone2, LocalDate dataCadastro, String email, String cnpj, String fantasia) {
		super(nome, endereco, telefone1, telefone2, dataCadastro, email);

		this.cnpj = cnpj;
		this.fantasia = fantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	
}
