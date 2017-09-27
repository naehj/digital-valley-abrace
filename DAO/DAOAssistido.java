package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Assistido;

public class DAOAssistido {
	Connection con;
	public DAOAssistido() throws ClassNotFoundException {
		this.con = new Conexao().getConnection();
	}
	public void adiciona(Assistido assistido) {
		String sql = "insert into Assistido"
	+"(nome, cpf, endereco, dataNascimento, dataCadastro, telefone, telefone2, rg, email, tipodeCancer, ativo)"
	+"(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);

			// seta os valores

			stmt.setString(1, assistido.getNome());
			stmt.setString(2, assistido.getCpf());
			stmt.setString(3, assistido.getEndereco());

			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
