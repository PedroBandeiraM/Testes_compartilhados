package a_classeMetodos_construtorThis_toString;

import java.util.Scanner;

public class B_Retangulo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print(" - Digite a altura do retângulo: ");
		double altura = leitor.nextDouble();
		
		System.out.print(" - Digite a largura do retângulo: ");
		double largura = leitor.nextDouble();
		
		B_class_Retangulo retangulo = new B_class_Retangulo(altura, largura);
		
		double perimetro = retangulo.perimetro();
		double area = retangulo.area();
		double diagonal = retangulo.diagonal();
		
		System.out.printf("""
				%n -> Dados do retângulo:
				    - Perímetro: %.2f
				    - Área: %.2f
				    - Diagonal %.2f
				""", perimetro, area, diagonal);
		
		leitor.close();
	}

}
