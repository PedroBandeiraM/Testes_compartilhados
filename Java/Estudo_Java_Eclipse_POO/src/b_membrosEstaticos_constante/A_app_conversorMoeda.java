/*
 * Conceitos:
 * 	- Atributos e métodos estáticos (static)
 *  - Constante (final)
 */

package b_membrosEstaticos_constante;

import java.util.Scanner;

public class A_app_conversorMoeda {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite uma quantia em reais: R$");
		double real = leitor.nextDouble();
		
		double dolar = A_class_conversorMoeda.realDolar(real);
		
		System.out.printf(" -> Em dólares: $%.2f", dolar);
		leitor.close();
	}

}
