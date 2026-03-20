package g_abstracao;

public abstract class A_classFormas_abstracao { // Classe abstrata
	protected String cor;
	
	public A_classFormas_abstracao() {
		
	}
	
	public A_classFormas_abstracao(String cor) {
		this.cor = cor;
	}
	
	public abstract double calcularArea(); // Método abstrato
	
	public String toString() {
		return String.format("A forma de cor %s possui uma área de: %.2f", cor, calcularArea());
	}
	
}
