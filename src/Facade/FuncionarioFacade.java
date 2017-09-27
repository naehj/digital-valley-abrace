package Facade;

import DAO.ConnectionFactory;
import DAO.DAOFuncionario;
import Exceptions.FuncionarioInvalidoException;
import Exceptions.PessoaInvalidaException;
import Model.Funcionario;

public class FuncionarioFacade {

	public Funcionario loga(String login, String senha) {
		Funcionario func = null;
		try {
			func = new DAOFuncionario(new ConnectionFactory().abreConexao()).getFuncionario(login, senha);
			if(func == null) {
				System.out.println("O funcionário está null");
			}
		} catch (FuncionarioInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (PessoaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		finally {
			return func;
		}
	}
}
