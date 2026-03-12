package d_estruturaDados;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class D_app_lista {
	static List<D_class_lista> alunos = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		List<Double> notas = new ArrayList<>();
		String nome;
		int opcao, id;
		
		do {
			System.out.println("\n=-=-=-=-=-= ESCOLINHA DO BERIMBAL =-=-=-=-=-=\n");
			
			System.out.print("""
				Escolha uma opção: 
				  [1] Adicionar aluno
				  [2] Remover aluno
				  [3] Cadastro de alunos
				  [4] Filtrar aluno por ID
				  [5] Sair
				-> """ + " ");
			opcao = leitor.nextInt();
			leitor.nextLine();
			System.out.println();
			
			switch (opcao) {
			case 1:
				System.out.print("- Digite o nome do aluno: ");
				nome = leitor.nextLine();
				
				for (int i = 0; i < 2; i++) { 
					System.out.print("- Digite a " + (i + 1) + "º nota do aluno: ");
					notas.add(leitor.nextDouble());
					leitor.nextLine();
				} // Altere o limite de "i" para mudar a quantidade de notas (regra de negócio)
				
				alunos.add(new D_class_lista(nome, notas));
				notas.clear();
				
				if (alunos.getLast().getNome() == nome) {
					System.out.println(" -> Aluno adicionado.");
				} else {
					System.out.println(" -> Erro imprevisto. Aluno não foi adicionado.");
				}
				break;
			case 2:
				System.out.print("- Digite o ID do aluno: ");
				id = leitor.nextInt();
				leitor.nextLine();
				if (filtrarId(id) >= 0) {
					alunos.remove(id);
					System.out.println(" -> Aluno removido.");
				} else {
					System.out.println(" -> ID não encontrado.");
				}
				break;
			case 3:
				System.out.println("- CADASTRO: ");
				System.out.printf("%-5s | %-15s | %-5s %n", "ID", "NOME", "MÉDIA"); // Cabeçalho
				for (int i = 0; i < alunos.size(); i++)
					System.out.println(alunos.get(i));
				break;
			case 4:
				System.out.print("- Digite o ID do aluno: ");
				id = leitor.nextInt();
				leitor.nextLine();
				if (filtrarId(id) >= 0) {
					System.out.println("\n- CADASTRO FILTRADO: ");
					System.out.printf("%-5s | %-15s | %-5s %n", "ID", "NOME", "MÉDIA");
					System.out.println(alunos.get(filtrarId(id)));
				} else {
					System.out.println(" -> ID não encontrado.");
				}
				break;
			case 5:
				System.out.println(" ***Programa finalizado.");
				break;
			default:
				System.out.println(" ***Valor diigtado incorreto. Tente novamente.");
				break;
			}
			
		} while (opcao != 5);
		
		leitor.close();
	}
	
	public static int filtrarId(int id) {
		for (int i = 0; i < alunos.size(); i++) {
			if (alunos.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}
}
