package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Exceptions.FuncionarioInvalidoException;
import Exceptions.PessoaInvalidaException;
import Model.Funcionario;

public class DAOFuncionario extends ExecutaSQL{

	public DAOFuncionario(Connection connection) {
		super(connection);
	}
	
	public Funcionario getFuncionario(String login, String senha) throws FuncionarioInvalidoException, PessoaInvalidaException {
        //Alterando
		try {
        	String sql = "SELECT , idPessoa FROM FUNCIONARIO WHERE login=? AND senha=?";
            PreparedStatement ps = getConexao().prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                rs.next();
                int id = rs.getInt(1);
                return new Funcionario(id, login, senha);
            }
        } catch (SQLException ex) {
            System.err.println("Erro com a sintaxe SQL no metodo de consulta. GerenteDAO");    
        }
        return null;
    }

}
