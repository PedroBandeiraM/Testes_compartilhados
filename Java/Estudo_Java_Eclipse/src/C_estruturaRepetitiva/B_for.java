package C_estruturaRepetitiva;

import java.util.Scanner;

public class B_for {

	public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			
			System.out.print("Digite o ponto incial: ");
			int ponto_1 = leitor.nextInt();
			leitor.nextLine();
			
			System.out.print("Digite o ponto final: ");
			int ponto_2 = leitor.nextInt();
			leitor.nextLine();
			
			if (ponto_1 < ponto_2) {
				for (int i = ponto_1; i <= ponto_2; i++) {
					System.out.printf(" -> %d", i);
				}
			} 
			else {
				for (int i = ponto_1; i >= ponto_2; i--) {
					System.out.printf(" -> %d", i);
				}
			}
			
			leitor.close();
	}

}
