package program;

import java.util.Scanner;
import entities.Inquilino;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Inquilino[] inquilinos = new Inquilino[10];
		String nome, email;
		int i = 0, opcao, numQuarto;
		
	do {	
		System.out.println("TÍTULO");
		
			System.out.print("""
					- Escolha:
						[1] Alugar
						[2] ---
						[3] Visualizar
						[4] Sair
					-> """ + " ");
			opcao = leitor.nextInt();
			leitor.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.print("Nome: ");
				nome = leitor.nextLine();
				System.out.print("E-mail: ");
				email = leitor.nextLine();
				System.out.print("Quarto: ");
				numQuarto = leitor.nextInt();
				
				inquilinos[i] = new Inquilino(nome, email);

				if (inquilinos[numQuarto] == null) {
					inquilinos[i].alugarQuarto(numQuarto);
					System.out.println("\n -> Quarto alugado!");
				} else {
					System.out.println("\n -> Quarto já alugado. Escolha outro.");
				}
				
			case 2:
				break;
			case 3:
				for (int i = 0; i < 10; i++) { // ARRUMAR
					System.out.println("Quarto "+ i + ": " + inquilinos[i]);
				}
			case 4:
				System.out.println(" ***Programa fianlziado.");
				break;
			default:
				break;
			}
			i += 1;
		} while (opcao != 4);
	
		leitor.close();
	}

}
