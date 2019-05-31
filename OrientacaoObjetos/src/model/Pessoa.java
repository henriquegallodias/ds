package model;

public abstract class Pessoa {
	private String endereco;
	private double telefone;
	private String uf;
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
    public double getTelefone() {
    	return telefone;
    }
    public void setTelefone(double telefone) {
    	this.telefone = telefone;
    }
    public String getUf() {
    	return uf;
    }
    public void setUf(String uf) {
    	this.uf = uf;
    }
	


}
