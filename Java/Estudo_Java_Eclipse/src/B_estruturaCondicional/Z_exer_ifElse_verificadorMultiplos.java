package B_estruturaCondicional;

import java.util.Scanner;

public class Z_exer_ifElse_verificadorMultiplos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double num_1 = leitor.nextInt();
		leitor.nextLine();
		
		System.out.print("Digite outro número: ");
		double num_2 = leitor.nextInt();
		leitor.nextLine();
		
		if ((num_1 % num_2 == 0) || (num_2 % num_1 == 0)) {
			System.out.println("Os números sõa múltiplos!");
		} else {
			System.out.println("Os número não são múltiplos...");
		}
		
		leitor.close();
	}

}
