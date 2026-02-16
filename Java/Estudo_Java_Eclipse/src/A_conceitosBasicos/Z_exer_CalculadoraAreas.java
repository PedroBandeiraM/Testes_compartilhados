package A_conceitosBasicos;

import java.util.Scanner;
import java.util.Locale;

public class Z_exer_CalculadoraAreas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o tamaho do lado A: ");
		double valor_A = leitor.nextDouble();
		
		leitor.nextLine();
		
		System.out.print("Digite o tamaho do lado B: ");
		double valor_B = leitor.nextDouble();
		
		leitor.nextLine();
		
		System.out.print("Digite o tamaho do lado C: ");
		double valor_C = leitor.nextDouble();
		
		leitor.nextLine();
		
		double area_Triangulo = (valor_A * valor_C) / 2;
		double area_Circulo = Math.PI * Math.pow(valor_C, 2);
		double area_Trapezio = ((valor_A + valor_B) * valor_C) / 2;
		double area_Quadrado = Math.pow(valor_B, 2);
		double area_Retangulo = valor_A * valor_B;
	
		System.out.printf("%n - Respostas: %n%n %.2f%n %.2f%n %.2f%n %.2f%n %.2f%n", area_Triangulo, area_Circulo, area_Trapezio, area_Quadrado, area_Retangulo);
		
		leitor.close();
	}

}
