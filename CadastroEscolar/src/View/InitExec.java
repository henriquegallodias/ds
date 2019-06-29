package View;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class InitExec extends JFrame{
	
	JButton btnAlunos = new JButton("Alunos");
	JButton btnProfessores = new JButton("Professores");
		
		public InitExec(){
			super("Tela de Cadastro");
			
			Container paine = this.getContentPane();
			paine.setLayout(null);
			
			paine.add(btnAlunos);
			btnAlunos.setBounds(30,150,150,50);
			
			paine.add(btnProfessores);
			btnProfessores.setBounds(220,150,150,50);
			
			btnAlunos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AlunoExec aex = new AlunoExec();
				}
			});
			
			btnProfessores.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ProfessorExec pex = new ProfessorExec();
				}
			});
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(400, 400);
			this.setVisible(true);
			this.setResizable(false);
			paine.setBackground(Color.black);
		}
		
		public static void main(String args[]) {
			InitExec ex = new InitExec();
		}
}