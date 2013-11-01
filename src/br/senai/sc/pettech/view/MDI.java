package br.senai.sc.pettech.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import java.awt.Color;

public class MDI extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MDI frame = new MDI();
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
	public MDI() {
		getContentPane().setForeground(new Color(0, 0, 0));
		setForeground(new Color(0, 0, 128));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MDI.class.getResource("/Imagens/as.gif")));
		setTitle("PetTech");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		menuBar.add(mnCadastros);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mnCadastros.add(mntmCliente);
		
		JMenuItem mntmFornecedor = new JMenuItem("Fornecedor");
		mnCadastros.add(mntmFornecedor);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		mnCadastros.add(mntmProduto);
		
		JMenu mnMovimentao = new JMenu("Movimenta\u00E7\u00E3o");
		menuBar.add(mnMovimentao);
		
		JMenuItem mntmPedidoDeCompra = new JMenuItem("Pedido de Compra");
		mnMovimentao.add(mntmPedidoDeCompra);
		
		JMenuItem mntmPedidoDeVenda = new JMenuItem("Pedido de Venda");
		mnMovimentao.add(mntmPedidoDeVenda);
		
		JMenu mnEstoque = new JMenu("Estoque");
		menuBar.add(mnEstoque);
		
		JMenuItem mntmConsulta = new JMenuItem("Consulta");
		mnEstoque.add(mntmConsulta);
		
		JMenuItem mntmRelatrio = new JMenuItem("Relat\u00F3rio");
		mnEstoque.add(mntmRelatrio);
		
		JMenu mnUtilitrios = new JMenu("Utilit\u00E1rios");
		menuBar.add(mnUtilitrios);
		
		JMenuItem mntmUsurios = new JMenuItem("Usu\u00E1rios");
		mnUtilitrios.add(mntmUsurios);
		
		JMenuItem mntmAlterarSenha = new JMenuItem("Alterar Senha");
		mnUtilitrios.add(mntmAlterarSenha);
		
		JMenu mnSair = new JMenu("Sair");
		menuBar.add(mnSair);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnSair.add(mntmSair);
	}
}
