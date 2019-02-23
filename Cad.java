package view;

public class Cad {
	public static void main(String[] args) {
		Pfisica pf = new Pfisica();
		Pjuri pj = new Pjuri();
		
		pf.setname("Henrique");
		pj.setRazaoSocial("IBM");
		pf.setendereco("rua");
		pj.setendereco("rua 2");
		pf.setbairro("itaquera");
		pj.setbairro("tatuape");
		pf.setcep(123456);
		pj.setcep(345234);
		
		
	    System.out.println(pf.getname());
	    System.out.println(pj.getRazaoSocial());
	    System.out.println(pf.getendereco());
	    System.out.println(pj.getendereco());
	    System.out.println(pf.getbairro());
	    System.out.println(pj.getbairro());
	    System.out.println(pf.getcep());
	    System.out.println(pj.getcep());
		
	}

}
