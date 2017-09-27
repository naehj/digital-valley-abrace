package View;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;

public class CadastroAssistido extends Shell {
	private Text nome;
	private Text cpf;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			CadastroAssistido shell = new CadastroAssistido(display);
			shell.open();
			shell.layout();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the shell.
	 * @param display
	 */
	public CadastroAssistido(Display display) {
		super(display, SWT.SHELL_TRIM);
		
		Label lblCadastrodeAssistido = new Label(this, SWT.CENTER);
		lblCadastrodeAssistido.setAlignment(SWT.CENTER);
		lblCadastrodeAssistido.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 30, SWT.NORMAL));
		lblCadastrodeAssistido.setBounds(76, 65, 401, 64);
		lblCadastrodeAssistido.setText("Cadastro de assistido");
		
		Label lblNome = new Label(this, SWT.NONE);
		lblNome.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 12, SWT.NORMAL));
		lblNome.setBounds(82, 149, 53, 21);
		lblNome.setText("Nome:");
		
		nome = new Text(this, SWT.BORDER);
		nome.setBounds(151, 149, 310, 21);
		
		Label lblCpf = new Label(this, SWT.NONE);
		lblCpf.setText("CPF:");
		lblCpf.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 12, SWT.NORMAL));
		lblCpf.setBounds(102, 175, 33, 21);
		
		cpf = new Text(this, SWT.BORDER);
		cpf.setBounds(151, 175, 310, 21);
		
		Label label_1 = new Label(this, SWT.NONE);
		label_1.setText("Nome:");
		label_1.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 12, SWT.NORMAL));
		label_1.setBounds(82, 201, 53, 21);
		
		text_1 = new Text(this, SWT.BORDER);
		text_1.setBounds(151, 201, 310, 21);
		
		Label label_2 = new Label(this, SWT.NONE);
		label_2.setText("Nome:");
		label_2.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 12, SWT.NORMAL));
		label_2.setBounds(82, 228, 53, 21);
		
		text_2 = new Text(this, SWT.BORDER);
		text_2.setBounds(151, 228, 310, 21);
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("SWT Application");
		setSize(612, 569);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
