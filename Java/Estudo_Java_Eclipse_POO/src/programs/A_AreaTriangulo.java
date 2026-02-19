package programs;

import java.util.Scanner;
import entities.A_class_AreaTriangulo;

public class A_AreaTriangulo {

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
			
			A_class_AreaTriangulo forma = new A_class_AreaTriangulo(ladoA, ladoB, ladoC);
			forma.calcularArea();
			System.out.println(forma);
			
			System.out.print(" - Deseja continuar [S/N]? ");
			continuar = leitor.next().trim().toUpperCase().charAt(0);
			System.out.println("");
		} while (continuar == 'S');
		
		leitor.close();
	}

}
