package C_estruturaRepetitiva;

import java.util.Scanner;

public class Z_exer_doWhile_menuCombustivel {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int alcool = 0, gasolina = 0, diesel = 0, opcao;	
		
		do {
			System.out.print("""
					- Escolha uma opção de abastecimento:
					[1] Álcool
					[2] Gasolina
					[3] Diesel
					[4] Sair
					->  """);
			
			opcao = leitor.nextInt();
			leitor.nextLine();
			
			switch (opcao) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			case 4:
				System.out.println();
				
				System.out.printf("""
						
						-> Tabela
						Álcool: %d
						Gasolina: %d
						Diesel: %d
						
						""", alcool, gasolina, diesel);
				
				System.out.println(" *Programa encerrado.");
				break;
			default:
				System.out.println(" *Valor digitado incorreto. Tente novamente.");
				break;
			}
			
			System.out.println();
			
		} while (opcao != 4);
		
		leitor.close();
	}

}
