package C_estruturaRepetitiva;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Z_exer_for_intervaloMultiplos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		List<Integer> multiplos = new ArrayList<>();
		
		System.out.print("Digite um número: ");
		int num = leitor.nextInt();
		leitor.nextLine();
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				multiplos.add(i);
			}
		}
		
		System.out.println(" -> Múltiplos: " + multiplos);
		leitor.close();
	}

}
