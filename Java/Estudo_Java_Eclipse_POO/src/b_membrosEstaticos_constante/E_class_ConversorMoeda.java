package b_membrosEstaticos_constante;

public class E_class_ConversorMoeda {
	static final double IOF = 1.06; // Taxa de conversão -> 6%
	static double dolar = 5.5;
	
	public static double realDolar(double real) {
		return (dolar * real * IOF);
	}
}
