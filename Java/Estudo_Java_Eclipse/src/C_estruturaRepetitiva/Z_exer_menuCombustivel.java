package C_estruturaRepetitiva;

import java.util.Scanner;

public class Z_exer_menuCombustivel {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;		
		
		while (true) {
			System.out.print("""
					- Escolha uma opção de abastecimento:
					[1] Álcool
					[2] Gasolina
					[3] Diesel
					[4] Sair
					->  """);
			
			int opcao = leitor.nextInt();
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
				for (int i = 0; i < 4; i++) {
				    System.out.println();
				}
				
				System.out.printf("""
						
						-> Tabela
						Álcool: %d
						Gasolina: %d
						Diesel: %d
						
						""", alcool, gasolina, diesel);
				
				System.out.println(" *Programa encerrado.");
				leitor.close();
				System.exit(0);
			default:
				System.out.println(" *Valor digitado incorreto. Tente nopvamente.");
				break;
			}
			
			for (int i = 0; i < 4; i++) {
			    System.out.println();
			}
			
		}
		
	}

}
