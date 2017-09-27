package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Pessoa_Juridica;

public class PessoaJDAO {
	
	Connection con;
	public PessoaJDAO() throws ClassNotFoundException {
		this.con = new Conexao().getConnection();
	}
	//Incompleto
	public int adicionaDoador(Pessoa_Juridica pessoaJ) {
		String sql1 = "insert into Pessoa"+"(idPessoa, nome, endereco, telefone1, telefone2, dataCadastro, email)"+"(?, ?, ?, ?, ?, ?, ?)";
		String sql2 = "insert into Pessoa_J"+"(idPessoa, fantasia)"	+"(?, ?, ?)"; 
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql1);
			
			
			
			
			stmt.execute();
			
			final ResultSet rs = stmt.getGeneratedKeys();
			
			stmt.close();
			return rs.getInt(1);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	public void buscaDoador() {
		
	}
	
	public void listaDoador() {
		
	}
	
	public void excluioDoador() {
		
	}
}
