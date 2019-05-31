package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadPF extends JFrame {
	
	JLabel lblnome = new JLabel("Nome:");
	JLabel lblcpf = new JLabel("CPF:");
	JLabel lbltelefone = new JLabel("Telefone:");
	JLabel lblidade = new JLabel("Idade:");
	JLabel lblendereco = new JLabel("Endereço:");
	
	JTextField txtnome = new JTextField();
	JTextField txtcpf = new JTextField();
	JTextField txttelefone = new JTextField();
	JTextField txtidade = new JTextField();
	JTextField txtendereco = new JTextField();
	
	JButton btnCadPF = new JButton("Cadastrar");
	
	public CadPF() {
		super("Tela CadPF");
		Container paine = this.getContentPane();
		
		paine.setLayout(null);
		
		paine.add(lblnome);
		lblnome.setBounds(40,40,60,25);
		
		paine.add(txtnome);
		txtnome.setBounds(150,40,200,25);
		
		paine.add(lblcpf);
		lblcpf.setBounds(40,90,60,25);
		
		paine.add(txtcpf);
		txtcpf.setBounds(150,90,200,25);
		
		paine.add(lbltelefone);
		lbltelefone.setBounds(40,140,60,25);
		
		paine.add(txttelefone);
		txttelefone.setBounds(150,140,200,25);
		
		paine.add(lblidade);
		lblidade.setBounds(40,190,60,25);
		
		paine.add(txtidade);
		txtidade.setBounds(150,190,200,25);
		
		paine.add(lblendereco);
		lblendereco.setBounds(40,240,60,25);
		
		paine.add(txtendereco);
		txtendereco.setBounds(150,240,200,25);
		
		paine.add(btnCadPF);
		btnCadPF.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.PessoaFisica pf = new model.PessoaFisica();
				pf.setNome(txtnome.getText());
				pf.setCpf(Double.parseDouble(txtcpf.getText()));
				pf.setTelefone(Double.parseDouble(txttelefone.getText()));
				pf.setIdade(Double.parseDouble(txtidade.getText()));
				pf.setEndereco(txtendereco.getText());
				
				JOptionPane.showMessageDialog(null,"Nome:" + pf.getNome() + "\n CPF:" + pf.getCpf() + "\n Telefone:" + pf.getTelefone() + "\n Idade:" + pf.getIdade() + "\n Endereço:" + pf.getEndereco() );
				
			}
		});
		btnCadPF.setBounds(120,300,150,50);
		
		
		this.setSize(400,400);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		CadPF cadpf = new CadPF();
	}
}	
