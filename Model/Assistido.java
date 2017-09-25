package Model;

public class Assistido extends Pessoa {
	private String tipoDeCancer;
    private String ativo;
    private String plano;
    private LinkedList<String> tratamentos;
    private String observacoes;
	
    public String getTipoDeCancer() {
		return tipoDeCancer;
	}
	public void setTipoDeCancer(String tipoDeCancer) {
		this.tipoDeCancer = tipoDeCancer;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public String getPlano() {
		return plano;
	}
	public void setPlano(String plano) {
		this.plano = plano;
	}
	public LinkedList<String> getTratamentos() {
		return tratamentos;
	}
	public void setTratamentos(LinkedList<String> tratamentos) {
		this.tratamentos = tratamentos;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
    
}
