package exer_conceitosBasicos;

import java.util.Scanner;

public class OperacaoGenerica {

		public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			System.out.print("Digite 4 valores separados por espaço: ");
			
			int num_1 = leitor.nextInt();
			int num_2 = leitor.nextInt();
			int num_3 = leitor.nextInt();
			int num_4 = leitor.nextInt();
			
			leitor.close();
			
			int operacao = (num_1 * num_2) - (num_3 * num_4);
			
			System.out.printf("A operação é: %d", operacao);
		}
}
