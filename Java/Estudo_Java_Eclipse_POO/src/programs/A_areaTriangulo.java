package programs;

import java.util.Scanner;
import entities.A_class_Triangulo;

public class A_areaTriangulo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		char continuar;
		
		do {
			System.out.print("Digite o valor do lado A: ");
			double ladoA = leitor.nextDouble();
			System.out.print("Digite o valor do lado B: ");
			double ladoB = leitor.nextDouble();
			System.out.print("Digite o valor do lado C: ");
			double ladoC = leitor.nextDouble();
			
			A_class_Triangulo forma = new A_class_Triangulo(ladoA, ladoB, ladoC);
			double areaForma = forma.calcularArea();
			
			System.out.printf(" -> A área do triângulo é: %.2f %n%n", areaForma);
			
			System.out.print(" - Deseja continuar [S/N]? ");
			continuar = leitor.next().trim().toUpperCase().charAt(0);
		} while (continuar == 'S');
		
		leitor.close();
	}

}
