package DAO;

public class Conexao {
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class Conexao {
	    
	    private String url;
	    private String usuario;
	    private String senha;
	    private String driver;
	    public Connection con;

	//construtor - toda vez que esta classe é instanciada cria uma conexão
	    public Conexao() {
	        
	        driver = "org.postgresql.Driver";
	        url = "jdbc:postgresql://192.169.1.2:1527/n2s";
	        usuario = "postgres";
	        senha = "n2s";

	        try {

	            Class.forName(driver);
	            con = DriverManager.getConnection(url, usuario, senha);

	        } catch (ClassNotFoundException objErroDriver) {
	            System.out.println("Erro no carregamento do driver JDBC");

	        } catch (SQLException objErroConexao) {

	            System.out.println("Erro na Conexao");

	        }
	    }

	    PreparedStatement prepareStatement(String sql) throws SQLException {
	        return con.prepareStatement(sql);
	    }
	}
}
