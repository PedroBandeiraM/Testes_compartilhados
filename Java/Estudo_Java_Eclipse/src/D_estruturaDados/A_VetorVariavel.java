package D_estruturaDados;

import java.util.Scanner;
import java.util.Arrays;

public class A_VetorVariavel {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double[] alturas = new double[3];
		double somaAlturas = 0, mediaAlturas;
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite uma altura: ");
			alturas[i] = leitor.nextDouble();
			somaAlturas += alturas[i];
		}
		
		mediaAlturas = somaAlturas / alturas.length;
		
		System.out.println("\nAltuas digitadas: "+ Arrays.toString(alturas));
		System.out.println("Médias das alturas: " + mediaAlturas);
		
		leitor.close();
	}
}
