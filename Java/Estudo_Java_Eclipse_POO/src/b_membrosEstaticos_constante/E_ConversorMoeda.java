/*
 * Conceitos:
 * 	- Atributos e métodos estáticos (static)
 *  - Constante (final)
 */

package b_membrosEstaticos_constante;

import java.util.Scanner;

public class E_ConversorMoeda {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite uma quantia em reais: R$");
		double real = leitor.nextDouble();
		
		double dolar = E_class_ConversorMoeda.realDolar(real);
		
		System.out.printf(" -> Em dólares: $%.2f", dolar);
		leitor.close();
	}

}
