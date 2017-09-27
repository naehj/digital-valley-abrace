package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Pessoa;

public class PessoaDAO {
	
	Connection con;
	public PessoaDAO() throws ClassNotFoundException {
		this.con = new Conexao().getConnection();
	}
	//Incompleto
	public void adiciona(Pessoa pessoa) {
		String sql = "insert into Pessoa"
					+"(idPessoa, nome, endereco, telefone1, telefone2, dataCadastro, email)"
					+"(?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, pessoa.getIdPessoa());
			stmt.setString(2, pessoa.getNome());
			stmt.setString(3, pessoa.getEndereco());
			stmt.setString(4, pessoa.getTelefone1());
			stmt.setString(5, pessoa.getTelefone2());
			stmt.setDate(6, new Date(pessoa.getDataCadastro().getYear(), pessoa.getDataCadastro().getMonthValue(), pessoa.getDataCadastro().getDayOfMonth()));
			stmt.setString(7, pessoa.getEmail());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
			
	}
}

