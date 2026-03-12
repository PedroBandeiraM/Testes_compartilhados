package b_membrosEstaticos_constante;

public class A_class_conversorMoeda {
	static final double IOF = 1.06; // Taxa de conversão -> 6%
	static double dolar = 5.5;
	
	public static double realDolar(double real) {
		return (dolar * real * IOF);
	}
}
