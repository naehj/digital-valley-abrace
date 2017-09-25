package Model;

import java.time.LocalDate;

public class Doador_PJuridica extends Pessoa{

	public Doador_PJuridica(String nome, String endereco, LocalDate dataCadastro, String telefone, String telefone2, String email) {
		super(nome, endereco, dataCadastro, telefone, telefone2, email);
	}
	
	public Doador_PJuridica(String nome, String endereco, LocalDate dataCadastro, String telefone, String telefone2, String email, String cnpj){
		super(nome, endereco, dataCadastro, telefone, telefone2, email);
		this.cnpj = cnpj;
		
	}
	private String cnpj;
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
