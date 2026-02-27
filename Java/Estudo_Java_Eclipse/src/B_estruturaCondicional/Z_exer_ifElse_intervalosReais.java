package B_estruturaCondicional;

import java.util.Scanner;

public class Z_exer_ifElse_intervalosReais {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = leitor.nextInt();
		leitor.nextLine();
		
		if (num >= 0 && num < 25) {
			System.out.println("O intervalo é [0, 25)");
		} else if (num >= 25 && num < 50) {
			System.out.println("O intervalo é [25, 50)");
		} else if (num >= 50 && num < 75) {
			System.out.println("O intervalo é [50, 75)");
		} else if (num >= 75 && num <= 100) {
			System.out.println("O intervalo é [75, 100]");
		} else {
			System.out.println("O intervalo é grande ou pequeno demais!");
		}
		
		leitor.close();
	}

}
