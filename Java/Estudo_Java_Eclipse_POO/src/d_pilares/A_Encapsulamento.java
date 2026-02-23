package d_pilares;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class A_Encapsulamento {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();
		List<Integer> ids = new ArrayList<>();

		String nome;
		int id = 0;
		char continuar;
		int opcao;
		
		do {
			System.out.print("Digite o nome: ");
			nome = leitor.nextLine();
			
			id += 1;
			
			nomes.add(nome);
			ids.add(id);
			
			System.out.print(" - Deseja continuar [S/N]? ");
			continuar = leitor.next().trim().toUpperCase().charAt(0);
			leitor.nextLine();
		} while (continuar == 'S');
		
		A_class_Encapsulamento cadastro = new A_class_Encapsulamento(nomes, ids);
		
		do {
			System.out.printf("""
					%nEscolha uma opção: 
						[1] Ver cadastro
						[2] Atualizar nome por ID
						[3] Visualizar nome por ID
						[4] Encontrar ID por nome
						[5] Sair
						->  """);
			opcao = leitor.nextInt();
			leitor.nextLine();
			
			switch (opcao) {
			case 1:
				cadastro.info();
				System.out.printf("%n ***Pressione ENTER para continuar.");
				leitor.nextLine();
				break;
			case 2:
				System.out.printf("%n -> Digite um ID para alterar um nome: ");
				id = leitor.nextInt();
				leitor.nextLine();
				System.out.print(" -> Digite o novo nome: ");
				nome = leitor.nextLine();
				cadastro.setNome(id, nome);
				break;
			case 3:
				System.out.printf("%n -> Digite um ID para encontrar um nome: ");
				id = leitor.nextInt();
				leitor.nextLine();
				System.out.printf("""
						%n%10s
						  ID  |  Nomes
						  %d   |  %s
						""", "TABELA", id, cadastro.getNome(id));
				break;
			case 4:
				System.out.print("%n -> Digite o nome: ");
				nome = leitor.nextLine();
				System.out.println("   - ID: " + cadastro.getId(nome));
				break;
			case 5:
				System.out.printf("%n ***Sistema finalizado.");
				break;
			default:
				System.out.printf("%n ***Valor digitado incorreto. Tente novamente.");
				break;
			}
			
		} while (opcao != 5);
		
		
		
		
		
		leitor.close();
	}

}
