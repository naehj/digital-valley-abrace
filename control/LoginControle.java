package control;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

import exceptions.PessoaInvalidaException;
import exceptions.UsuarioInvalidoException;
import facade.LoginFachada;
import model.Usuario;
import view.Login;

public class LoginControle {
	private Login view;
	private LoginFachada facade;
		
	public void getEvent(ActionEvent event){
		if (event.getActionCommand().equals("Entrar")){
			try {
				Usuario usuario = facade.loga(view.getTfUsuario().getText(), view.getTfSenha().getText());
				if(usuario == null) {
					System.out.println("Não encontramos o usuário no banco");
				}
			} catch (UsuarioInvalidoException e) {
				view.MensagemErro(e);
			} catch (PessoaInvalidaException e) {
				view.MensagemErro(e);
			}
			
		}
	}
	
	public LoginControle(LoginFachada facade) {
		setFacade(facade);
		setLogin(new Login(this));
	}

	private void setLogin(Login login) {
		if(login != null) {
			this.view = login;
		}
	}

	private void setFacade(LoginFachada facade) {
		if(facade != null) {
			this.facade = facade; 
		}
	}
		
}
