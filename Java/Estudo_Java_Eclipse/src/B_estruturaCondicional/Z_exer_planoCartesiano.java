package B_estruturaCondicional;

import java.util.Scanner;
import java.util.Locale;

public class Z_exer_planoCartesiano {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o ponto A: ");
		double ponto_A = leitor.nextDouble();
		leitor.nextLine();
		
		System.out.print("Digite o ponto B: ");
		double ponto_B = leitor.nextDouble();
		leitor.nextLine();
		
		System.out.println("");
		if (ponto_A == 0 && ponto_B == 0) {
			System.out.println("Coordenada: Origem");
		} else if (ponto_A == 0){
			System.out.println("Eixo: Y");
		} else if (ponto_B == 0) {
			System.out.println("Eixo: X");
		} else if (ponto_A > 0 && ponto_B > 0) {
			System.out.println("Quadrante: 1");
		} else if (ponto_A < 0 && ponto_B > 0) {
			System.out.println("Quadrante: 2");
		} else if (ponto_A < 0 && ponto_B < 0) {
			System.out.println("Quadrante: 3");
		} else if (ponto_A > 0 && ponto_B < 0) {
			System.out.println("Quadrante: 4");
		}
		
		leitor.close();
	}
	
}
