package g_abstracao;

public class A_classCirculo_abstracao extends A_classFormas_abstracao {
	private final Double PI = Math.PI;
	private Double raio;
	
	public A_classCirculo_abstracao(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return PI * Math.pow(raio, 2);
	}
}
