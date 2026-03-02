package D_estruturaDados;

import java.util.Scanner;

public class Z_exer_vetor_PencaoInquilino {
	static Z_exer_class_vetor_PencaoInquilino[] inquilinos = new Z_exer_class_vetor_PencaoInquilino[10];

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome, email;
		int opcao, numQuarto;
		
		do {
			System.out.println("=-=-=-=-=-= PENÇÃO DO JORGE =-=-=-=-=-=");
		
			System.out.print("""
					\n- Escolha:
					  [1] Alugar quarto
					  [2] Desocupar quarto
					  [3] Visualizar disponibilidade
					  [4] Sair do programa
					  -> """ + " ");
			opcao = leitor.nextInt();
			leitor.nextLine();
			System.out.println();
			
			switch (opcao) {
			case 1:
				System.out.print(" - Nome: ");
				nome = leitor.nextLine();
				System.out.print(" - E-mail: ");
				email = leitor.nextLine();
				System.out.print(" - Quarto: ");
				numQuarto = leitor.nextInt();
				leitor.nextLine();
				
				if (quartoDisponivel(numQuarto)) {
					inquilinos[numQuarto] = new Z_exer_class_vetor_PencaoInquilino(nome, email);
					inquilinos[numQuarto].alugarQuarto(numQuarto);
					System.out.println("   -> Quarto alugado! \n");
				} else {
					System.out.println("   -> Quarto já alugado. Escolha outro. \n");
				}
				break;
			case 2:
				System.out.print(" - Quarto: ");
				numQuarto = leitor.nextInt();
				leitor.nextLine();
				
				if (!quartoDisponivel(numQuarto)) {
					inquilinos[numQuarto] = null;
					System.out.println("    -> Quarto desocupado!");
				} else {
					System.out.println("    -> Quarto já desocupado. Escolha novamente.");
				}
				break;
			case 3:
				System.out.println("Listagem de quartos: \n");
				for (int i = 0; i < 10; i++) { 
					System.out.println("Quarto "+ i + ": " + inquilinos[i]);
				}
				System.out.println();
				break;
			case 4:
				System.out.println(" ***Programa finalizado.");
				break;
			default:
				break;
			}
		} while (opcao != 4);
	
		leitor.close();
	}

	public static boolean quartoDisponivel(int numQuarto) {
		if (inquilinos[numQuarto] == null) {
			return true;
		} else {
			return false;
		}
	}
}
