package View;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.DateTime;

public class CadastroAssistido extends Shell {
	private Text tfNome;
	private Text tfCpf;
	private Text tfEndereco;
	private Text tfTelefone;
	private Text tfRg;

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
	 * @throws ParseException 
	 */
	public CadastroAssistido(Display display) throws ParseException {
		super(display, SWT.SHELL_TRIM);
		MaskFormatter mascaracpf = new MaskFormatter("###.###.###-##");
		Label lblCadastrodeAssistido = new Label(this, SWT.CENTER);
		lblCadastrodeAssistido.setAlignment(SWT.CENTER);
		lblCadastrodeAssistido.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 30, SWT.NORMAL));
		lblCadastrodeAssistido.setBounds(161, 43, 376, 53);
		lblCadastrodeAssistido.setText("Cadastro de assistido");
		
		Label lblNome = new Label(this, SWT.NONE);
		lblNome.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 16, SWT.NORMAL));
		lblNome.setBounds(187, 147, 62, 28);
		lblNome.setText("Nome:");
		
		tfNome = new Text(this, SWT.BORDER);
		tfNome.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		tfNome.setBounds(255, 147, 369, 32);
		
		Label lblCpf = new Label(this, SWT.NONE);
		lblCpf.setText("CPF:");
		lblCpf.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 16, SWT.NORMAL));
		lblCpf.setBounds(209, 183, 40, 28);
		
		tfCpf = new Text(this, SWT.BORDER);
		tfCpf.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		tfCpf.setBounds(255, 185, 369, 32);
		
		Label lblEndereo = new Label(this, SWT.NONE);
		lblEndereo.setText("Endere\u00E7o:");
		lblEndereo.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 16, SWT.NORMAL));
		lblEndereo.setBounds(158, 260, 91, 28);
		
		tfEndereco = new Text(this, SWT.BORDER);
		tfEndereco.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		tfEndereco.setBounds(255, 262, 369, 32);
		
		Label lblDataDeNascimento = new Label(this, SWT.NONE);
		lblDataDeNascimento.setText("Data de Nascimento:");
		lblDataDeNascimento.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 16, SWT.NORMAL));
		lblDataDeNascimento.setBounds(54, 300, 195, 28);
		
		Label lblTelefone = new Label(this, SWT.NONE);
		lblTelefone.setText("Telefone:");
		lblTelefone.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 16, SWT.NORMAL));
		lblTelefone.setBounds(164, 338, 85, 28);
		
		tfTelefone = new Text(this, SWT.BORDER);
		tfTelefone.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		tfTelefone.setBounds(255, 338, 369, 32);
		
		tfRg = new Text(this, SWT.BORDER);
		tfRg.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		tfRg.setBounds(255, 223, 369, 32);
		
		Label lblRg = new Label(this, SWT.NONE);
		lblRg.setText("RG:");
		lblRg.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 16, SWT.NORMAL));
		lblRg.setBounds(217, 221, 32, 28);
		
		DateTime dataNascimento = new DateTime(this, SWT.BORDER);
		dataNascimento.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		dataNascimento.setBounds(255, 300, 310, 32);
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("SWT Application");
		setSize(715, 569);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
