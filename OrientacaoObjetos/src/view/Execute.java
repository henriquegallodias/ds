package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Execute extends JFrame {
	
	JButton btnCadPF = new JButton("Cadastre PF");
	JButton btnCadPJ = new JButton("Cadastre PJ");
	
	public Execute() {
		super("Tela Inicial");
		Container paine = this.getContentPane();
		
		paine.setLayout(null);
		
		btnCadPF.setBounds(150,100,200,100);
		btnCadPF.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CadPF pf = new CadPF();
			}
			
		});
		paine.add(btnCadPF);
		
		btnCadPJ.setBounds(150,250,200,100);
		btnCadPJ.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CadPJ pj = new CadPJ();
			}
		});
		paine.add(btnCadPJ);
		
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		paine.setBackground(Color.blue);
		
	}

	public static void main(String[] args) {
		Execute exec = new Execute();

	}

}
