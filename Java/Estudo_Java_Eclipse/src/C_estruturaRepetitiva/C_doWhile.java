package C_estruturaRepetitiva;

import java.util.Scanner;
import java.util.Locale;

public class C_doWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		char continuar;
		
		do {
			System.out.print("Digite uma quantia em reais: R$");
			double reais = leitor.nextDouble();
			leitor.nextLine();
			
			double dolares = reais * 5.50;
			
			System.out.println(" -> Quantia convertida para o dólar: $" + dolares);
			System.out.print("\n - Deseja continuar [s/n]? ");
			continuar = leitor.next().toUpperCase().charAt(0);
			
			System.out.println("\n------------------------------------------\n");	
		} while (continuar == 'S');
		
		System.out.println(" *Programa finalizado.");
		
		leitor.close();
	}

}
