package a_classeMetodos_construtorThis_toString;

public class A_class_AreaTriangulo {
	
	double ladoA;
	double ladoB;
	double ladoC;
	double area;

	public A_class_AreaTriangulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public double calcularArea() {
		double s = (ladoA + ladoB + ladoC) / 2.0; 
		area = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
		return area;
	}	
	
	public String toString() {
		return String.format(" -> A área do triângulo é: %.2f", area);
	}
}
