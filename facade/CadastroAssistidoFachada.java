package facade;

import DAO.DAOAssistido;
import model.Assistido;

public class CadastroAssistidoFachada {
	private Assistido assistido;
	private DAOAssistido DAO;

	public CadastroAssistidoFachada(Assistido assistido) throws ClassNotFoundException {
		this.assistido = assistido;
		this.DAO = new DAOAssistido();
	}

	public Assistido getAssistido() {
		return assistido;
	}

	public void setAssistido(Assistido assistido) {
		this.assistido = assistido;
	}

	public DAOAssistido getDAO() {
		return DAO;
	}

	public void setDAO(DAOAssistido dAO) {
		DAO = dAO;
	}
}
