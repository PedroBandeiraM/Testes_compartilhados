package B_estruturaCondicional;

import java.util.Scanner;

public class Z_exer_ifElse_parImpar {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = leitor.nextInt();
		leitor.nextLine();
		
		if (num % 2 == 0) {
			System.out.printf("O número %d é PAR!", num);
		} else {
			System.out.printf("O número %d é ÍMPAR!", num);
		}
		
		leitor.close();
	}

}
