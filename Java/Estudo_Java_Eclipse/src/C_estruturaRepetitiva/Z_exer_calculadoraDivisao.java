package C_estruturaRepetitiva;

import java.util.Scanner;

public class Z_exer_calculadoraDivisao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite quantas divisões deseja realizar: ");
		int quant = leitor.nextInt();
		leitor.nextLine();
		
		for (int i = 1; i <= quant; i++) {
			System.out.print("\nDigite o numerador: ");
			double numerador = leitor.nextDouble();
			leitor.nextLine();
			
			System.out.print("Digite o denominador: ");
			double denominador = leitor.nextDouble();
			leitor.nextLine();
			
			if (denominador != 0) {
				double divisao = numerador / denominador;
				System.out.println(" -> Resposta: " + divisao);
			}
			else {
				System.out.println(" -> Erro: Não é possível dividir por zero.");
			}
			
		}
		
		leitor.close();
	}
}
