package entities;

public class Inquilino {
	String nome, email;
	int numQuarto;

	public Inquilino(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public void alugarQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}
	
	public String toString() {
		return "Nome: "
				+ nome  
				+ "E-mail: "
				+ email 
				+ "Quarto: "
				+ numQuarto;
	}

}
