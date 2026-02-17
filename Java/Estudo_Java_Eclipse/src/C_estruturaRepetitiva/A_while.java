package C_estruturaRepetitiva;

import java.util.Scanner;

public class A_while {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num = 1;
		int soma = 0;
		int cont = 0;
		
		while (num != 0) {
			cont++; 
			System.out.printf("Digite o %dº número (0 para parar): ", cont);
			num = leitor.nextInt();
			leitor.nextLine();
			soma += num;
		}
		
		System.out.printf("-> A soma é: %d", soma);
		
		leitor.close();
	}

}
