package view;

import java.text.ParseException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class CadastroAssistido extends Shell {
	private Text tfNome;
	private Text tfCpf;
	private Text tfEndereco;
	private Text tfTelefone;
	private Text tfRg;
	private Text tfTelefone2;
	private Text tfEmail;
	private Text tfTipodeCancer;
	


	public Text getTfNome() {
		return tfNome;
	}

	public void setTfNome(Text tfNome) {
		this.tfNome = tfNome;
	}

	public Text getTfCpf() {
		return tfCpf;
	}

	public void setTfCpf(Text tfCpf) {
		this.tfCpf = tfCpf;
	}

	public Text getTfEndereco() {
		return tfEndereco;
	}

	public void setTfEndereco(Text tfEndereco) {
		this.tfEndereco = tfEndereco;
	}

	public Text getTfTelefone() {
		return tfTelefone;
	}

	public void setTfTelefone(Text tfTelefone) {
		this.tfTelefone = tfTelefone;
	}

	public Text getTfRg() {
		return tfRg;
	}

	public void setTfRg(Text tfRg) {
		this.tfRg = tfRg;
	}

	public Text getTfTelefone2() {
		return tfTelefone2;
	}

	public void setTfTelefone2(Text tfTelefone2) {
		this.tfTelefone2 = tfTelefone2;
	}

	public Text getTfEmail() {
		return tfEmail;
	}

	public void setTfEmail(Text tfEmail) {
		this.tfEmail = tfEmail;
	}

	public Text getTfTipodeCancer() {
		return tfTipodeCancer;
	}

	public void setTfTipodeCancer(Text tfTipodeCancer) {
		this.tfTipodeCancer = tfTipodeCancer;
	}

	/**
	 * Launch the application.
	 * 
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
	 * 
	 * @param display
	 * @throws ParseException
	 */
	public CadastroAssistido(Display display) throws ParseException {
		super(display, SWT.SHELL_TRIM);
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

		tfTelefone2 = new Text(this, SWT.BORDER);
		tfTelefone2.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		tfTelefone2.setBounds(255, 376, 369, 32);

		Label lblTelefone_1 = new Label(this, SWT.NONE);
		lblTelefone_1.setText("Telefone2:");
		lblTelefone_1.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 16, SWT.NORMAL));
		lblTelefone_1.setBounds(153, 378, 96, 28);

		Label lblEmail = new Label(this, SWT.NONE);
		lblEmail.setText("Email:");
		lblEmail.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 16, SWT.NORMAL));
		lblEmail.setBounds(194, 415, 55, 28);

		tfEmail = new Text(this, SWT.BORDER);
		tfEmail.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		tfEmail.setBounds(255, 413, 369, 32);

		Label lblTipoDeCancer = new Label(this, SWT.NONE);
		lblTipoDeCancer.setText("Tipo de Cancer:");
		lblTipoDeCancer.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 16, SWT.NORMAL));
		lblTipoDeCancer.setBounds(106, 449, 144, 28);

		tfTipodeCancer = new Text(this, SWT.BORDER);
		tfTipodeCancer.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		tfTipodeCancer.setBounds(255, 451, 369, 32);

		Label lblAtivo = new Label(this, SWT.NONE);
		lblAtivo.setText("Ativo:");
		lblAtivo.setFont(SWTResourceManager.getFont("Segoe UI Emoji", 16, SWT.NORMAL));
		lblAtivo.setBounds(196, 483, 53, 28);

		Button btnAtivo = new Button(this, SWT.CHECK);
		btnAtivo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnAtivo.setFont(SWTResourceManager.getFont("Segoe UI", 25, SWT.NORMAL));
		btnAtivo.setBounds(255, 491, 13, 20);

		Button btnCadastrar = new Button(this, SWT.NONE);
		btnCadastrar.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		btnCadastrar.setBounds(299, 519, 100, 40);
		btnCadastrar.setText("Cadastrar");
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("SWT Application");
		setSize(715, 608);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
