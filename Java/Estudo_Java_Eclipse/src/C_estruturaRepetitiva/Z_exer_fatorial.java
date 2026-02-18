package C_estruturaRepetitiva;

import java.util.Scanner;

public class Z_exer_fatorial {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int fatorial = 1;
		
		System.out.print("Digite um número: ");
		int num = leitor.nextInt();
		leitor.nextLine();
		
		for (int i = num; i > 0; i--) {
			fatorial *= i;
		}
		System.out.println(" -> Fatorial: " + fatorial);
		
		leitor.close();
	}

}
