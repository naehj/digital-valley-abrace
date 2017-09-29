package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.PessoaJuridica;

public class PessoaJDAO extends ExecutaSQL{
	
	public PessoaJDAO(Connection connection) {
		super(connection);
	}
	
	//Incompleto
	public void adicionaDoador(PessoaJuridica pessoaJ) {
		String sql1 = "insert into Pessoa (nome, endereco, telefone1, telefone2, dataCadastro, email)" + "values(?, ?, ?, ?, ?, ?)";
		String sql2 = "insert into PessoaJuridica (cnpj, fantasia)" + "values(?, ?)"; 
		
		try {
			PreparedStatement stmt = getConexao().prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, pessoaJ.getNome());
			stmt.setString(2, pessoaJ.getEndereco());
			stmt.setString(3, pessoaJ.getTelefone1());
			stmt.setString(4, pessoaJ.getTelefone2());
			stmt.setDate(5, new Date(pessoaJ.getDataCadastro().getYear(), pessoaJ.getDataCadastro().getMonthValue(), pessoaJ.getDataCadastro().getDayOfMonth()));//ajeitar
			stmt.setString(6, pessoaJ.getEmail());
			
			stmt.execute();
			
			 // Recupera a id
	        ResultSet rs = stmt.getGeneratedKeys();
	        int id = 0;
	        if(rs.next()){
	            id = rs.getInt(1);
	        }
	        stmt = getConexao().prepareStatement(sql2);
	        
	        stmt.setString(1, pessoaJ.getCnpj());
	        stmt.setString(2, pessoaJ.getNomeFantasia());
	        stmt.setInt(3, id);
	        
			stmt.close();
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
