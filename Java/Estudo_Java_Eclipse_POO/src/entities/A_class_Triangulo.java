package entities;

public class A_class_Triangulo {
	
	double ladoA;
	double ladoB;
	double ladoC;

	public A_class_Triangulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public double calcularArea() {
		double s = (ladoA + ladoB + ladoC) / 2.0; 
		double area = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
		
		return area;
	}
}
