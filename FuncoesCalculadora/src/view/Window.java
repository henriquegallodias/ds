package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import view.Math;

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
	
	JButton jbponto = new JButton(",");
	JButton jbpor = new JButton("%");
	JButton jbfr = new JButton("1/x");
	
	JButton jbce = new JButton("CE");
	JButton jbseta = new JButton("←");
	JButton jbc = new JButton("C");
	JButton jbraiz = new JButton("√");
	JButton jbmm = new JButton("±");
	
	Math math = new Math();
	String sinal = null;
	double v1 = 0,v2 = 0;
	
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
	    jb0.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(txta.getText().equals("0")) {
	    			txta.setText("0");
	    		}else {
	    			txta.setText(txta.getText() + "0");
	    		}
	    	}
	    });
	    
	    
	    paine.add(jb1);
	    jb1.setBounds(10, 135,60 , 25);
	    jb1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(txta.getText().equals("0")) {
	    			txta.setText("1");
	    		}else {
	    			txta.setText(txta.getText() + "1");
	    		}
	    	}
	    });
	    
	    paine.add(jb2);
	    jb2.setBounds(70, 135, 60, 25);
	    
	    //adiciona função aos botoes
	    jb2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(txta.getText().equals("0")) {
	    			txta.setText("2");
	    		}else {
	    			txta.setText(txta.getText() + "2");
	    		}
	    	}
	    });
	    
	    paine.add(jb3);
	    jb3.setBounds(130, 135, 60, 25);
	    jb3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(txta.getText().equals("0")) {
	    			txta.setText("3");
	    		}else {
	    			txta.setText(txta.getText() + "3");
	    		}
	    	}
	    });
	    
	    paine.add(jb4);
	    jb4.setBounds(10,160,60,25);
	    jb4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(txta.getText().equals("0")) {
	    			txta.setText("4");
	    		}else {
	    			txta.setText(txta.getText() + "4");
	    		}
	    	}
	    });
	    
	    paine.add(jb5);
	    jb5.setBounds(70, 160, 60, 25);
	    jb5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(txta.getText().equals("0")) {
	    			txta.setText("5");
	    		}else {
	    			txta.setText(txta.getText() + "5");
	    		}
	    	}
	    });
	    
	    paine.add(jb6);
	    jb6.setBounds(130, 160, 60, 25);
	    jb6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(txta.getText().equals("0")) {
	    			txta.setText("6");
	    		}else {
	    			txta.setText(txta.getText() +  "6");
	    		}
	    	}
	    });
	    paine.add(jb7);
	    jb7.setBounds(10, 185, 60, 25);
	    jb7.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(txta.getText().equals("0")) {
	    			txta.setText("7");
	    		}else {
	    			txta.setText(txta.getText() + "7");
	    		}
	    	}
	    });
	    
	    paine.add(jb8);
	    jb8.setBounds(70, 185, 60, 25);
	    jb8.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(txta.getText().equals("0")) {
	    			txta.setText("8");
	    		}else {
	    			txta.setText(txta.getText() + "8");
	    		}
	    	}
	    });
	    
	    paine.add(jb9);
	    jb9.setBounds(130, 185, 60, 25);
	    jb9.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(txta.getText().equals("0")) {
	    			txta.setText("9");
	    		}else {
	    			txta.setText(txta.getText() + "9");
	    		}
	    	}
	    });
	    
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
	    jbplus.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		v1 = Double.parseDouble(txta.getText());
	    		sinal = "soma";
	    		txta.setText("0");
	    	}
	    });
	    
	    paine.add(jbigual);
	    jbigual.setBounds(250, 185, 60, 50);
	    jbigual.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		v2 = Double.parseDouble(txta.getText());
	    		
	    		if(sinal.equals("soma")) {
	    			txta.setText(math.soma(v1,v2) + "" + "");
	    		}
	    		else if(sinal.equals("menos")) {
	    			txta.setText(math.menos(v1, v2) + "");
	    		}
	    		else if(sinal.equals("multiplicação")) {
	    			txta.setText(math.mult(v1, v2) + "");
	    		}
	    		else if(sinal.equals("divisão")) {
	    			txta.setText(math.div(v1, v2) + "");
	    		}
	    		else if(sinal.equals("raiz")) {
	    			txta.setText(math.raiz(v1) + "");
	    		}	
	    		else if(sinal.equals("fração")) {
	    			txta.setText(math.fracao(v1)+"");
	    		}
	    		else if(sinal.equals("porcentagem")) {
	    			txta.setText(math.porcent(v1, v2) + "");
	    		}	
	    	}
	    });
	    
	    paine.add(jbmenos);
	    jbmenos.setBounds(190, 185	, 60, 25);
	    jbmenos.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		v1 = Double.parseDouble(txta.getText());
	    		sinal = "menos";
	    		txta.setText("0");
	    	}
	    });
	    
	    paine.add(jbdiv);
	    jbdiv.setBounds(190, 135, 60, 25);
	    jbdiv.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		v1 = Double.parseDouble(txta.getText());
	    		sinal = "divisão";
	    		txta.setText("0");
	    	}
	    });
	    
	    paine.add(jbvezes);
	    jbvezes.setBounds(190, 160, 60, 25);
	    jbvezes.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		v1 = Double.parseDouble(txta.getText());
	    		sinal = "multiplicação";
	    		txta.setText("0");
	    	}
	    });
	    
	    paine.add(jbponto);
	    jbponto.setBounds(130, 210, 60, 25);
	    jbponto.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(txta.getText().equals("0")) {
	    			txta.setText(",");
	    		} else {
	    			txta.setText(txta.getText() + ",");
	    		}
	    	}
	    });
	    
	    paine.add(jbpor);
	    jbpor.setBounds(250, 135, 60, 25);
	    jbpor.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		v1 = Double.parseDouble(txta.getText());
	    		sinal = "porcentagem";
	    		txta.setText("0");
	    			
	    		}
	    });
	    
	    paine.add(jbfr);
	    jbfr.setBounds(250, 160, 60, 25);
	    jbfr.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		v1 = Double.parseDouble(txta.getText());
	    		sinal = "fração";
	    		txta.setText("0");
	    	}
	    });
	    
	    paine.add(jbseta);
	    jbseta.setBounds(10,110,60,25);
	    jbseta.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent evt) {
	    		String str = txta.getText();
	    	    StringBuilder w = new StringBuilder(str);
	    		str = String.valueOf( w.deleteCharAt(str.length() -1));
	    		txta.setText(str);
	    	}
	    });
	    
	    paine.add(jbce);
	    jbce.setBounds(70, 110, 60, 25);
	    
	    paine.add(jbc);
	    jbc.setBounds(130, 110, 60, 25);
	    jbc.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		txta.setText("0");
	    	}
	    });
	    
	    paine.add(jbmm);
	    jbmm.setBounds(190, 110, 60, 25);
	    jbmm.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		txta.setText("-");
	    	}
	    });
	    
	    paine.add(jbraiz);
	    jbraiz.setBounds(250,110,60,25);
	    jbraiz.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		v1 = Double.parseDouble(txta.getText());
	    		sinal = "raiz";
	    		txta.setText("0");
	    	}
	    });
	    
	    
	    
		
		
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
