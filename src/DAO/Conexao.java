package DAO;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

		public Connection getConnection() {
			try {
				return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "");
				
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
}