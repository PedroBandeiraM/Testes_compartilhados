// Calculadora: área de um círculos

package A_conceitosBasicos;

import java.util.Scanner;

public class Z_exer_AreaCirculo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o raio do círculo: ");
		double raio = leitor.nextDouble();
		leitor.nextLine();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("A área do círculo é: %.4f", area);
		
		leitor.close();
	}
	
}
