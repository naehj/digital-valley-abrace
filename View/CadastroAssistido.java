package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Point;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class CadastroAssistido {

	private JFrame frame;
	private JTextField nome;
	private JLabel lblNewLabel;
	private JTextField cpf;
	private JLabel lblEndereo;
	private JTextField endereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAssistido window = new CadastroAssistido();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroAssistido() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 615, 568);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		lblNome.setBounds(114, 131, 46, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblCadastroDeAssistido = new JLabel("Cadastro de assistido");
		lblCadastroDeAssistido.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeAssistido.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 36));
		lblCadastroDeAssistido.setBounds(114, 54, 382, 49);
		frame.getContentPane().add(lblCadastroDeAssistido);
		
		nome = new JTextField();
		nome.setBounds(170, 128, 326, 20);
		frame.getContentPane().add(nome);
		nome.setColumns(10);
		
		lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(130, 156, 30, 14);
		frame.getContentPane().add(lblNewLabel);
		
		cpf = new JTextField();
		cpf.setColumns(10);
		cpf.setBounds(170, 153, 326, 20);
		frame.getContentPane().add(cpf);
		
		lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		lblEndereo.setBounds(93, 181, 67, 14);
		frame.getContentPane().add(lblEndereo);
		
		endereco = new JTextField();
		endereco.setColumns(10);
		endereco.setBounds(170, 178, 326, 20);
		frame.getContentPane().add(endereco);
	}
}
