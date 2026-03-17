package e_heranca;

public class A_classAnimal_heranca {
	protected String nome; // Atributo particular compartilhado apenas com subclasses
	protected boolean fome, sono; // Atributo particular compartilhado apenas com subclasses
	
	public A_classAnimal_heranca() { // Construtor padrão
	}
	
	public A_classAnimal_heranca(String nome, boolean fome, boolean sono) { // Construtor secundário
		this.nome = nome;
		this.fome = fome;
		this.sono = sono;
	}
	
	public void comer() {
		if (fome == true) {
			fome = false;
			System.out.println("O animal de nome \"" + nome + "\" comeu e está satisfeito!");
		} else {
			System.out.println("O animal de nome \"" + nome + "\" não está com fome.");
		}
	}
	
	public void dormir() {
		if (sono == true) {
			sono = false;
			System.out.println("O animal de nome \"" + nome + "\" dormiu e está feliz!");
		} else {
			System.out.println("O animal de nome \"" + nome + "\" não está com sono.");
		}
	}
	
}
