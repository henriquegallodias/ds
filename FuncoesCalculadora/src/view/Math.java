package view;

public class Math {
	public double soma(double v1,double v2) {
		double total = v1 + v2;
		return total ;
	}
	public double menos(double v1,double v2) {
		double total = v1 - v2;
		return total;
	}
	public double mult(double v1,double v2) {
		double total = v1 * v2;
		return total;
	}
	public double div(double v1,double v2) {
		double total = v1 / v2;
		return total;
	}
	public double elev(double v1,double v2) {
		double total = java.lang.Math.pow( v1, v2);
		return total;
	}
	public double raiz(double v1) {
		double total = java.lang.Math.sqrt(v1);
		return total;
	}
	

}
