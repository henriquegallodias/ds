package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Window extends JFrame {
	
	JLabel lblnome = new JLabel("Nome:");
	JLabel lblendereco = new JLabel("Endereço:");
	JLabel lblcidade = new JLabel("Cidade:");
	JLabel lblbairro = new JLabel("Bairro:");
	JLabel lbltelefone = new JLabel("Telefone:");
	JLabel lblrg = new JLabel("RG:");
	JLabel lblcep = new JLabel("CEP:");
	JLabel lblsexo = new JLabel("Sexo:");
	JLabel lblestado = new JLabel("Estado:");
	JLabel lblcelular = new JLabel("Celular:");
	JLabel lblcpf = new JLabel("CPF:");
	
	JTextField txtnome = new JTextField();
	JTextField txtendereco = new JTextField();
	JTextField txtcidade = new JTextField();
	JTextField txtbairro = new JTextField();
	JTextField txttelefone = new JTextField();
	JTextField txtrg = new JTextField();
	JTextField txtcep = new JTextField();
	JTextField txtcelular = new JTextField();
	JTextField txtcpf = new JTextField();
	
	JButton jbsalvar = new JButton("Salvar");
	JButton jbimprimir = new JButton("Imprimir");
	
	JComboBox jcbest = new JComboBox(new Object[] {"AC","SP","RJ","GO","PR","BA","MA"});
	
	JRadioButton jrbsex = new JRadioButton("Feminino");
	JRadioButton jrbsexm = new JRadioButton("Masculino");
	
	
	public Window() {
		super("CADASTRO");
		
		Container paine = this.getContentPane();
	
		
		paine.add(lblnome);
		lblnome.setBounds(10, 10, 150, 50);
		paine.add(lblendereco);
		lblendereco.setBounds(10, 50, 150, 150);
		paine.add(lblcidade);
		paine.add(lblbairro);
		paine.add(lbltelefone);
		paine.add(lblrg);
		paine.add(lblsexo);
		paine.add(lblcep);
		paine.add(lblestado);
		paine.add(lblcelular);
		paine.add(lblcpf);
		paine.add(jcbest);
		paine.add(jrbsex);
		paine.add(jrbsexm);
		paine.add(jbsalvar);
		paine.add(jbimprimir);
		paine.add(txtnome);
		paine.add(txtendereco);
		paine.add(txtcidade);
		paine.add(txtbairro);
		paine.add(txttelefone);
		paine.add(txtrg);
		paine.add(txtcep);
		paine.add(txtcelular);
		paine.add(txtcpf);
		
		this.setLayout(null);
		
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Window w = new Window();
	}
  
}
