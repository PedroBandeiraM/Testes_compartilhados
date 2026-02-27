package C_estruturaRepetitiva;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Z_exer_for_parImparIntervalo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();
		
		System.out.print("Digite um valor limite (positivo): ");
		int ponto_final = leitor.nextInt();
		leitor.nextLine();
		
		for (int i = 0; i <= ponto_final; i++) {
			if (i % 2 == 0) {
				pares.add(i);
			} else {
				impares.add(i);
			}
		}
		
		System.out.println("\n-> Pares: " + pares);
		System.out.println("\n-> Ímpares: " + impares);
		
		leitor.close();
	}

}
