package view;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Window extends JFrame {
	
	JTextField txta = new JTextField();//Usado para criar uma area de texto
	
	JButton jbexibir = new JButton("Exibir");//JButton é usado para criar um botão
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
	JButton jbvezes = new JButton("*");
	JButton jbdiv = new JButton("/");
	JButton jbigual = new JButton("=");
	
	JButton jbmc = new JButton("MC");
	JButton jbmr = new JButton("MR");
	JButton jbms = new JButton("MS");
	JButton jbmmais = new JButton("M+");
	JButton jbmmenos = new JButton("M-");
	
	JButton jbponto = new JButton(".");
	JButton jbpor = new JButton("%");
	JButton jbfr = new JButton("1/x");
	
	JButton jbce = new JButton("CE");
	JButton jbseta = new JButton("←");
	JButton jbc = new JButton("C");
	JButton jbraiz = new JButton("√");
	JButton jbmm = new JButton("±");
	
	public Window() {
		super("Calculadora");//titulo da janela
		
		Container paine = this.getContentPane();
		
		paine.setLayout(null);
		
		paine.add(txta);//adiciona o atributo a janela
	    txta.setBounds(10, 32, 301, 50);
	    
	    paine.add(jbexibir);
	    jbexibir.setBounds(10, 4, 100, 25);//define o tamanho e posição do atributo
	    
	    paine.add(jbeditar);
	    jbeditar.setBounds(110, 4, 100, 25);
	    
	    paine.add(jbajuda);
	    jbajuda.setBounds(210, 4, 100, 25);
	    
	    paine.add(jb0);
	    jb0.setBounds(10, 210, 120, 25);
	    
	    
	    paine.add(jb1);
	    jb1.setBounds(10, 135,60 , 25);
	    
	    paine.add(jb2);
	    jb2.setBounds(70, 135, 60, 25);
	    
	    paine.add(jb3);
	    jb3.setBounds(130, 135, 60, 25);
	    
	    paine.add(jb4);
	    jb4.setBounds(10,160,60,25);
	    
	    paine.add(jb5);
	    jb5.setBounds(70, 160, 60, 25);
	    
	    paine.add(jb6);
	    jb6.setBounds(130, 160, 60, 25);
	    
	    paine.add(jb7);
	    jb7.setBounds(10, 185, 60, 25);
	    
	    paine.add(jb8);
	    jb8.setBounds(70, 185, 60, 25);
	    
	    paine.add(jb9);
	    jb9.setBounds(130, 185, 60, 25);
	    
	    paine.add(jbmc);
	    jbmc.setBounds(10, 85, 60, 25);
	    
	    paine.add(jbms);
	    jbms.setBounds(70, 85, 60, 25);
	    
	    paine.add(jbmr);
	    jbmr.setBounds(130, 85, 60, 25);
	    
	    paine.add(jbmmais);
	    jbmmais.setBounds(190,85,60,25);
	    
	    paine.add(jbmmenos);
	    jbmmenos.setBounds(250, 85, 60, 25);
	    
	    paine.add(jbplus);
	    jbplus.setBounds(190, 210, 60, 25);
	    
	    paine.add(jbigual);
	    jbigual.setBounds(250, 185, 60, 50);
	    
	    paine.add(jbmenos);
	    jbmenos.setBounds(190, 185	, 60, 25);
	    
	    paine.add(jbdiv);
	    jbdiv.setBounds(190, 135, 60, 25);
	    
	    paine.add(jbvezes);
	    jbvezes.setBounds(190, 160, 60, 25);
	    
	    paine.add(jbponto);
	    jbponto.setBounds(130, 210, 60, 25);
	    
	    paine.add(jbpor);
	    jbpor.setBounds(250, 135, 60, 25);
	    
	    paine.add(jbfr);
	    jbfr.setBounds(250, 160, 60, 25);
	    
	    paine.add(jbseta);
	    jbseta.setBounds(10,110,60,25);
	    
	    paine.add(jbce);
	    jbce.setBounds(70, 110, 60, 25);
	    
	    paine.add(jbc);
	    jbc.setBounds(130, 110, 60, 25);
	    
	    paine.add(jbmm);
	    jbmm.setBounds(190, 110, 60, 25);
	    
	    paine.add(jbraiz);
	    jbraiz.setBounds(250,110,60,25);
	    
	    
	    
		
		
		this.setSize(325,275);//define o tamanho da janela
		this.setVisible(true);//define se a janela é visivel ou não
		this.setResizable(false);//define se a janela é redimensionavel
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.BLACK);
	}
	public static void main(String[] args) {
		
	Window a = new Window();
	
	}
	
}
