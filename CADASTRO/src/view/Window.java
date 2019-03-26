package view;

import java.awt.Color;
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
	JTextField txtcelular = new JTextField("()   -    ");
	JTextField txtcpf = new JTextField();
	
	JButton jbsalvar = new JButton("Salvar");
	JButton jbimprimir = new JButton("Imprimir");
	
	JComboBox jcbest = new JComboBox(new Object[] {"AC","SP","RJ","GO","PR","BA","MA","PA","SC","RR","RS","TO","ES","MG","AL","PE","PB","MT","MS","CE"});
	
	JRadioButton jrbsex = new JRadioButton("Feminino");
	JRadioButton jrbsexm = new JRadioButton("Masculino");
	
	
	public Window() {
		super("CADASTRO");
		
		Container paine = this.getContentPane();
	
		
		paine.add(lblnome);
		lblnome.setBounds(15, 25, 60, 10);
		paine.add(lblendereco);
		lblendereco.setBounds(15, 65, 60, 10);
		paine.add(lblcidade);
		lblcidade.setBounds(15, 105, 60, 10);
		paine.add(lblbairro);
		lblbairro.setBounds(15, 145, 60, 10);
		paine.add(lbltelefone);
		lbltelefone.setBounds(15, 185, 60, 10);
		paine.add(lblrg);
		lblrg.setBounds(15,225,60,10);
		paine.add(lblsexo);
		lblsexo.setBounds(320, 25, 60, 10);
		paine.add(lblcep);
		lblcep.setBounds(320, 65, 60, 10);
		paine.add(lblestado);
		lblestado.setBounds(320, 105, 60, 10);
		paine.add(lblcelular);
		lblcelular.setBounds(320,145,60,10);
		paine.add(lblcpf);
		lblcpf.setBounds(320, 185, 60, 10);
		paine.add(jcbest);
		jcbest.setBounds(395, 95, 180, 30);
		paine.add(jrbsex);
		jrbsex.setBounds(390, 25, 90, 12);
		paine.add(jrbsexm);
		jrbsexm.setBounds(480, 25, 90, 12);
		paine.add(jbsalvar);
		jbsalvar.setBounds(160, 270, 120, 30);
		paine.add(jbimprimir);
		jbimprimir.setBounds(285, 270, 120, 30);
		paine.add(txtnome);
		txtnome.setBounds(90, 15, 180, 30);
		paine.add(txtendereco);
		txtendereco.setBounds(90, 55, 180, 30);
		paine.add(txtcidade);
		txtcidade.setBounds(90, 95, 180, 30);
		paine.add(txtbairro);
		txtbairro.setBounds(90, 135, 180, 30);
		paine.add(txttelefone);
		txttelefone.setBounds(90, 175, 180, 30);
		paine.add(txtrg);
		txtrg.setBounds(90, 215, 180, 30);
		paine.add(txtcep);
		txtcep.setBounds(395, 55, 180, 30);
		paine.add(txtcelular);
		txtcelular.setBounds(395, 135, 180, 30);
		paine.add(txtcpf);
		txtcpf.setBounds(395, 175, 180, 30);
		
		this.setLayout(null);
		
		this.setSize(600,350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.ORANGE);
	}
	public static void main(String[] args) {
		Window w = new Window();
	}
  
}
