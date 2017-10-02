package control;

import org.eclipse.swt.events.SelectionEvent;

import model.Assistido;
import view.CadastroAssistido;

public class CadastroAssistidoControle {
	private CadastroAssistido view;

	public CadastroAssistidoControle(CadastroAssistido view) {
		this.view = view;
	}

	public CadastroAssistido getView() {
		return view;
	}

	public void setView(CadastroAssistido view) {
		this.view = view;
	}

	public void getEvent(SelectionEvent event) {
		if (event.toString().equals("btnCadastrar")) {
			Assistido model = new Assistido();
			model.setNome(view.getTfNome().toString());
		}
	}
}
