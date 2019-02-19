package calc;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;



public class MATH extends JFrame{
	
	
	    JComboBox as = new JComboBox();
		JLabel a = new JLabel("henrique");
	
	public double soma(double a,double b) {
		double total = a + b;
		return total;
		
		
	}
	
	public double sub(double x,double y) {
		double totals = x - y;
		return totals;
	}
	public double div(double z,double h) {
		double totald = z/h;
		return totald;
	}
	public double mult(double d,double e) {
		double totalm = d * e;
		return totalm;
	}
	public double elev(double s,double p) {
		double totale = Math.pow(s,p);
		return totale;
	}
	public double raiz(double x) {
		double totalr = Math.sqrt(x);
		return totalr;
		
	}
	public double porc(double as) {
		double totalp = as*(as/100);
		return totalp;
	}
	public MATH() {
		super("calculadora");
		
		
		
		Container paine = this.getContentPane();
		
		paine.add(a);
		a.setBounds(200,15,50,50);
		
		paine.add(as);
		as.setBounds(40,40,100,30);
		as.addItem("Masculino");
		as.addItem("Feminino");
		
		
		
		this.setLayout(null);
		this.setSize(400,400);
		this.getContentPane().setBackground(Color.red);
		this.setVisible(true);
		this.setResizable(false);
	
	}
	
	
		
	
	public static void main(String[] args) {
		
		MATH a = new MATH(); 
			
		System.out.println(a.soma(200,300));
		System.out.println(a.sub(2000,300));
		System.out.println(a.div(200,4));
		System.out.println(a.mult(20,30));
		System.out.println(a.elev(2,3));
		System.out.println(a.raiz(81));
		System.out.println(a.porc(10));
		
		
		
	}

}
