package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.ButtonGroup;



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
	
	JFormattedTextField txttelefone = null;
	JFormattedTextField txtrg = null;
	JFormattedTextField txtcep = null;
	JFormattedTextField txtcelular = null;
	JFormattedTextField txtcpf = null;
	
	JButton jbsalvar = new JButton("Salvar");
	JButton jbimprimir = new JButton("Imprimir");
	
	JComboBox jcbest = new JComboBox(new Object[] {"AC","SP","RJ","GO","PR","BA","MA","PA","SC","RR","RS","TO","ES","MG","AL","PE","PB","MT","MS","CE"});
	
	JRadioButton[] jrbsexo = new JRadioButton[2]; 
	ButtonGroup Control = new ButtonGroup();{ 
	
	jrbsexo[0] = new JRadioButton("Feminino");
	jrbsexo[1] = new JRadioButton("Masculino");} 
	
	MaskFormatter formatTel = null;
	MaskFormatter formatCel = null;
	MaskFormatter formatCpf = null;
	MaskFormatter formatCep = null;
	MaskFormatter formatRg = null;
	
	model.Window aa = new model.Window();
	
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
		jcbest.setBackground(Color.orange);
		
	    Control.add(jrbsexo[0]); 
		Control.add(jrbsexo[1]);
		
		paine.add(jrbsexo[0]); 
		jrbsexo[0].setBounds(390, 25, 90, 12);
		paine.add(jrbsexo[1]);
		jrbsexo[1].setBounds(480, 25, 90, 12);
		jrbsexo[0].setBackground(Color.orange);
		jrbsexo[1].setBackground(Color.orange);
		
		paine.add(jbsalvar);
		jbsalvar.setBounds(160, 270, 120, 30);
		jbsalvar.setBackground(Color.orange);
		jbsalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aa.setname(txtnome.getText());
				aa.setend(txtendereco.getText());
			}
		});
		
		paine.add(jbimprimir);
		jbimprimir.setBounds(285, 270, 120, 30);
		jbimprimir.setBackground(Color.orange);
		
		paine.add(txtnome);
		txtnome.setBounds(90, 15, 180, 30);
		
		paine.add(txtendereco);
		txtendereco.setBounds(90, 55, 180, 30);
		
		paine.add(txtcidade);
		txtcidade.setBounds(90, 95, 180, 30);
		
		paine.add(txtbairro);
		txtbairro.setBounds(90, 135, 180, 30);
		
		try {
			formatTel = new MaskFormatter("(##)####-####");
			txttelefone = new JFormattedTextField(formatTel);
		} catch (Exception ext) {
			ext.printStackTrace();
		}
		paine.add(txttelefone);
		txttelefone.setBounds(90, 175, 180, 30);
		
		try {
			formatRg = new MaskFormatter("##.###.###-A");
			txtrg = new JFormattedTextField(formatRg);
		} catch (Exception exr) { 
			exr.printStackTrace();
		}
		paine.add(txtrg);
		txtrg.setBounds(90, 215, 180, 30);
		
		try { 
			formatCep = new MaskFormatter("#####-###");
			txtcep = new JFormattedTextField(formatCep);
		} catch (Exception ex) { 
			ex.printStackTrace();
		}
		paine.add(txtcep);
		txtcep.setBounds(395, 55, 180, 30);
		
		try {
			formatCel = new MaskFormatter("(##)#####-####"); 
			txtcelular = new JFormattedTextField(formatCel);
		} catch (Exception exc) { 
			exc.printStackTrace();
		}
		paine.add(txtcelular);
		txtcelular.setBounds(395, 135, 180, 30);
		
		try {
			formatCpf = new MaskFormatter("###.###.###-##"); 
			txtcpf = new JFormattedTextField(formatCpf);
		} catch (Exception exf) { 
			exf.printStackTrace();
		}
		paine.add(txtcpf);
		txtcpf.setBounds(395, 175, 180, 30);
		
		this.setLayout(null);
		this.setSize(600,350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.orange);
	}
	public static void main(String[] args) {
		Window w = new Window();
	}
  
}
