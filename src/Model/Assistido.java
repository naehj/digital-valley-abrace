package Model;
import java.time.LocalDate;
import java.util.ArrayList;

import Exceptions.PessoaInvalidaException;
public class Assistido extends Pessoa {
	private String tipoDeCancer;
    private boolean ativo;
    private String plano;
    private ArrayList<String> tratamentos = new ArrayList<String>();
    private String observacoes;
	
	public Assistido(String nome, String cpf, String endereco, LocalDate dataNascimento, LocalDate dataCadastro,
			String telefone, String telefone2, long rg, String email, String tipoDeCancer, boolean ativo,
			String plano, String observacoes) throws PessoaInvalidaException {
		super(nome, cpf, endereco, dataNascimento, dataCadastro, telefone, telefone2, rg, email);
		setTipoDeCancer(tipoDeCancer);
		setAtivo(ativo);
		setPlano(plano);
		setObservacoes(observacoes);
		
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
	public String getPlano() {
		return plano;
	}
	public void setPlano(String plano) {
		this.plano = plano;
	}
	public ArrayList<String> getTratamentos() {
		return tratamentos;
	}
	public void setTratamentos(ArrayList<String> tratamentos) {
		this.tratamentos = tratamentos;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
