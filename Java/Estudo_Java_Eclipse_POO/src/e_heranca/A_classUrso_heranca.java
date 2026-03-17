package e_heranca;

public class A_classUrso_heranca extends A_classAnimal_heranca {
	private String raca; // Atriubto particular desta classe
	
	public A_classUrso_heranca(String nome, boolean fome, boolean sono, String raca) {
		super(nome, fome, sono); // Ativa construtor d classe pai
		this.raca = raca;
	}
	
	@Override //Explicita para a IDE que sobrescreve outro método
	public final void dormir() { // final impede que haja mais métodos sobrescritos
		if (sono == true) {
			sono = false;
			System.out.println("O urso ("+ raca +") de nome \"" + nome + "\" hibernou e está feliz!");
		} else {
			System.out.println("O urso ("+ raca +") de nome \"" + nome + "\" não está com sono.");
		}
	}
	
}
