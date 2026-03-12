package f_composicao;

import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app_composicao {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		List<class_funcionario> funcionarios = new ArrayList<>();
		
		String nome;
		enum_nivel nivel;
		int opcao;
		double salarioBase;
		
		do {
			System.out.println("========== CALCULADORA DE PROJETOS ==========");
		
			System.out.print("""
					\n- Escolha uma opção: 
					  [1] Adicionar funcionário
					  [2] Remover funcionário
					  [3] Visualizar funcionários
					  [4] Atribuir projeto 
					  [5] Calcular salário de funcionário por mês
					  [6] Sair
					-> """ + " ");
			opcao = leitor.nextInt();
			leitor.nextLine();
			System.out.println();
			
			switch (opcao) {
			case 1:
				System.out.print("- Digite seu nome: ");
				nome = leitor.nextLine();
				System.out.print("- Digite seu nível (1 à 3): ");
				nivel = enum_nivel.fromCodigo(leitor.nextInt());
				leitor.nextLine();
				System.out.print("- Digite seu salário: R$");
				salarioBase = leitor.nextDouble();
				leitor.nextLine();
				
				funcionarios.add(new class_funcionario(nome, nivel, salarioBase));
				
				break;
			case 2:
				
				break;
			case 3:
				System.out.println("========== TABELA DE FUNCIONÁRIOS ==========\n");
				System.out.printf("%-15s | %-8s | %-10s \n", "Nome", "Nível", "Salário");
				System.out.println("--------------------------------------");
				for (class_funcionario funcionario : funcionarios) {
					System.out.println(funcionario);
				}
				System.out.println("\n *** Aperte ENTER para continuar");
				leitor.nextLine();
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			default:
				
				break;
			}
		
		} while (opcao != 6);
		
		leitor.close();

	}

}
