package login;

public class LoginFachada {
	
	public static boolean verificaLogin(String usuario, String senha) {
		if(usuario.equals("admin") && senha.equals("admin")) {
			return true;
		}
		return false;
	}

}
