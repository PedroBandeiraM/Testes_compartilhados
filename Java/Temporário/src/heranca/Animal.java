package heranca;

public class Animal {
	protected String nome;
	protected boolean sono;
	
	public String getNome() {
		return nome;
	}
	
	public Animal() { // Método construtor padrão	
	}
	
	public Animal(String nome, boolean sono) {
		this.nome = nome;
		this.sono = sono;
	}
	
	public void fazerSom() {
		System.out.println("O " + nome + " fez um barulho!");
	}
	
	public void dormir() {
		this.sono = false;
		System.out.println("O " + nome + " dormiu...");
	}
	
}
