package model;

public class Pais {

	String cod;
	String nome;
	
	public Pais(String nome, String codigo) {
		this.cod = codigo;
		this.nome = nome;
	}
	
	public String getCod() {
		return cod;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCod(String cod) {
		this.cod = cod;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}