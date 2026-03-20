package g_abstracao;

public class A_app_abstracao {

	public static void main(String[] args) {
		// A_classFormas_abstracao forma = new A_classFormas_abstracao("Cinza"); // ERRO
		A_classFormas_abstracao retangulo = new A_classRetangulo_abstracao("vermelho", 4, 5);
		A_classFormas_abstracao circulo = new A_classCirculo_abstracao("azul", 3);

		System.out.println("Retângulo: " + retangulo + "\nCírculo: " + circulo);
	}

}
