package br.senai.sc.pettech.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Imagens/as.gif")));
		setTitle("PetTech");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEntrar.setBounds(183, 183, 69, 23);
		contentPane.add(btnEntrar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(183, 133, 123, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(183, 93, 123, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsurio.setBounds(97, 96, 46, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSenha.setBounds(97, 136, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Imagens/as.gif")));
		lblNewLabel.setBounds(3, 225, 46, 36);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/Imagens/as.gif")));
		label.setBounds(39, 183, 46, 36);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Login.class.getResource("/Imagens/as.gif")));
		label_1.setBounds(3, 151, 55, 36);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Login.class.getResource("/Imagens/as.gif")));
		label_2.setBounds(3, 77, 46, 36);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Login.class.getResource("/Imagens/as.gif")));
		label_3.setBounds(39, 117, 46, 36);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Login.class.getResource("/Imagens/as.gif")));
		label_4.setBounds(41, 43, 55, 36);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Login.class.getResource("/Imagens/as.gif")));
		label_5.setBounds(3, 12, 46, 36);
		contentPane.add(label_5);
	}
}
