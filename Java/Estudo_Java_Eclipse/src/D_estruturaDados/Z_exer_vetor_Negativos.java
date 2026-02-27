package D_estruturaDados;

import java.util.Scanner;
import java.util.Arrays;

public class Z_exer_vetor_Negativos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[] numeros;
		int repeticoes;
		
		System.out.print("Digite quantas números deseja testar: ");
		repeticoes = leitor.nextInt();
		
		numeros = new int[repeticoes];
		
		for (int i = 0; i < repeticoes; i++) {
			System.out.print("Digite o " + (i + 1) + " número: ");
			numeros[i] = leitor.nextInt();
			leitor.nextLine();
		}
		
		System.out.println();
		System.out.print("- Números digitados: " + Arrays.toString(numeros) + "\n");

		System.out.println("- Número negativos: ");
		System.out.print("  ->");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				System.out.print(" " + numeros[i]);
			}
		}
		
		leitor.close();
	}

}
