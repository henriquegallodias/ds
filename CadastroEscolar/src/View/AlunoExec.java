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

import Model.Alunos;
import Controller.AlunosJdbcDAO;
import Controller.JdbUtil;;

public class AlunoExec extends JFrame{
	
		JLabel lblNome = new JLabel("NOME");
		JLabel lblEndereco = new JLabel("ENDEREÇO");
		JLabel lblBairro = new JLabel("BAIRRO");
	
		JTextField txtNome = new JTextField("Nome:");
		JTextField txtEnd = new JTextField("Endereço:");
		JTextField txtBairro = new JTextField("Bairro:");
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		Alunos alunos = new Alunos();
		
		public AlunoExec(){
			super("Cadastro Aluno");
			
			Container paine = this.getContentPane();
			paine.setLayout(null);
			
			/*lblNome.setBounds(30, 60, 100, 20);
			paine.add(lblNome);*/
			
			txtNome.setBounds(100, 60, 200, 30);
			paine.add(txtNome);
			
			/*lblEndereco.setBounds(30, 120, 100, 20);
			paine.add(lblEndereco);*/
			
			txtEnd.setBounds(100, 120, 200, 30);
			paine.add(txtEnd);
			
			/*lblBairro.setBounds(30, 180, 100, 20);
			paine.add(lblBairro);*/
			
			txtBairro.setBounds(100, 180, 200, 30);
			paine.add(txtBairro);
			
			btnCadastrar.setBounds(100, 230, 200, 40);
			paine.add(btnCadastrar);
			btnCadastrar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					try {
						
						alunos.setNome(txtNome.getText());
						alunos.setEndereco(txtEnd.getText());
						alunos.setBairro(txtBairro.getText());
						
						Connection connection = JdbUtil.getConnection();
						AlunosJdbcDAO alunosJdbcDao = new AlunosJdbcDAO(connection);
						
						alunosJdbcDao.salvar(alunos);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});
			
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(400, 400);
			this.setVisible(true);
			this.setResizable(false);
			paine.setBackground(Color.yellow);
		}
		
		public static void main(String args[]) {
			AlunoExec ex = new AlunoExec();
		}
}
