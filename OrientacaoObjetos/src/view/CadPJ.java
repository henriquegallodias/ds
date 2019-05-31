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

public class CadPJ extends JFrame {
	
	JLabel lblrsocial = new JLabel("Razão Social:");
	JLabel lblcnpj = new JLabel("CNPJ:");
	JLabel lbltelefone = new JLabel("Telefone:");
	JLabel lblendereco = new JLabel("Endereço:");
	
	JTextField txtrsocial = new JTextField();
	JTextField txtcnpj = new JTextField();
	JTextField txttelefone = new JTextField();
	JTextField txtendereco = new JTextField();
	
	JButton btnCadPJ = new JButton("Cadastrar");
	
	 public CadPJ() {
	   super("Tela CadPJ");
	   Container paine = this.getContentPane();
	
	   paine.setLayout(null);
	   
	   paine.add(lblrsocial);
		lblrsocial.setBounds(40,40,100,25);
		
		paine.add(txtrsocial);
		txtrsocial.setBounds(150,40,200,25);
		
		paine.add(lblcnpj);
		lblcnpj.setBounds(40,90,60,25);
		
		paine.add(txtcnpj);
		txtcnpj.setBounds(150,90,200,25);
		
		paine.add(lbltelefone);
		lbltelefone.setBounds(40,140,60,25);
		
		paine.add(txttelefone);
		txttelefone.setBounds(150,140,200,25);
		
		paine.add(lblendereco);
		lblendereco.setBounds(40,190,60,25);
		
		paine.add(txtendereco);
		txtendereco.setBounds(150,190,200,25);
		
		
		paine.add(btnCadPJ);
		btnCadPJ.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.PessoaJuridica pj = new model.PessoaJuridica();
				pj.setRsocial(txtrsocial.getText());
				pj.setCnpj(Double.parseDouble(txtcnpj.getText()));
				pj.setTelefone(Double.parseDouble(txttelefone.getText()));
				pj.setEndereco(txtendereco.getText());
				
				JOptionPane.showMessageDialog(null,"Razão Social:" + pj.getRsocial() + "\n CNPJ:" + pj.getCnpj() + "\n Telefone:" + pj.getTelefone() + "\n Endereço:" + pj.getEndereco() );
				
			}
		});
		btnCadPJ.setBounds(120,260,150,50);
	
	
	
	   this.setSize(400,400);
	   this.setVisible(true);
	   this.setResizable(false);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
     public static void main(String[] args) {
	 CadPJ cadpj = new CadPJ();
   }
}
