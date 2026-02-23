package a_classeMetodos_construtorThis_toString;

public class B_class_Retangulo {
	double altura;
	double largura;
	
	public B_class_Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public double perimetro() {
		return (2 * altura) + (2 * largura);
	}
	
	public double area() {
		return (altura * largura);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
	}
	
}
