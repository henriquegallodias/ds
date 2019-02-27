package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Window extends JFrame {
	
	JTextField txta = new JTextField();
	
	JButton jbexibir = new JButton("Exibir");
	JButton jbeditar = new JButton("Editar");
	JButton jbajuda  = new JButton("Ajuda");
	
	JButton jb0 = new JButton("0");
	JButton jb1 = new JButton("1");
	JButton jb2 = new JButton("2");
	JButton jb3 = new JButton("3");
	JButton jb4 = new JButton("4");
	JButton jb5 = new JButton("5");
	JButton jb6 = new JButton("6");
	JButton jb7 = new JButton("7");
	JButton jb8 = new JButton("8");
	JButton jb9 = new JButton("9");
	
	JButton jbplus = new JButton("+");
	JButton jbmenos = new JButton("-");
	JButton jbvezes = new JButton("X");
	JButton jbdiv = new JButton("/");
	JButton jbigual = new JButton("=");
	

	
	
	public Window() {
		super("Calculadora");
		
		Container paine = this.getContentPane();
		
		paine.setLayout(null);
		
		paine.add(txta);
	    txta.setBounds(10, 30, 225, 50);
	    
	    paine.add(jbexibir);
	    jbexibir.setBounds(10, 2, 75, 25);
	    
	    paine.add(jbeditar);
	    jbeditar.setBounds(85, 2, 75, 25);
	    
	    paine.add(jbajuda);
	    jbajuda.setBounds(160, 2, 75, 25);
	    
	    paine.add(jb0);
	    jb0.setBounds(10, 185, 120, 25);
	    
	    
	    paine.add(jb1);
	    jb1.setBounds(10, 110,60 , 25);
	    
	    paine.add(jb2);
	    jb2.setBounds(70, 110, 60, 25);
	    
	    paine.add(jb3);
	    jb3.setBounds(130, 110, 60, 25);
	    
	    paine.add(jb4);
	    jb4.setBounds(10,135,60,25);
	    
	    paine.add(jb5);
	    jb5.setBounds(70, 135, 60, 25);
	    
	    paine.add(jb6);
	    jb6.setBounds(130, 135, 60, 25);
	    
	    paine.add(jb7);
	    jb7.setBounds(10, 160, 60, 25);
	    
	    paine.add(jb8);
	    jb8.setBounds(70, 160, 60, 25);
	    
	    paine.add(jb9);
	    jb9.setBounds(130, 160, 60, 25);
		
		
		this.setSize(250,300);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
	Window a = new Window();
	
	}
	
}
