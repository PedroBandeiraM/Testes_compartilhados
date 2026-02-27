package B_estruturaCondicional;

import java.util.Scanner;

public class Z_exer_ifElse_negativoPositivo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = leitor.nextInt();
		leitor.nextLine();
		
		if (num > 0) {
			System.out.printf("O número %d é positivo!", num);
		} else if (num < 0) {
			System.out.printf("O número %d é negativo!", num);
		} else {
			System.out.printf("O número %d é nulo!", num);
		}
		
		leitor.close();
	}

}
