package i_composicao;

import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app_empresa {
	static List<class_funcionario> funcionarios = new ArrayList<>();
	static Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String nome;
		enum_nivel nivel;
		int opcao, id;
		double salarioBase;
		
		do {
			System.out.println("========== CALCULADORA DE PROJETOS ==========");
		
			System.out.print("""
					\n- Escolha uma opção: 
					  [1] Adicionar funcionário
					  [2] Remover funcionário
					  [3] Visualizar cadastro de funcionários
					  [4] Atribuir contrato a funcionário
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
				System.out.println();
				
				funcionarios.add(new class_funcionario(nome, nivel, salarioBase));
				break;
			case 2:
				System.out.print("- Digite o ID do funcionário: ");
				id = leitor.nextInt();
				leitor.nextLine();
				System.out.println();
				removerFuncionario(id);
				break;
			case 3:
				tabelaFuncionarios();
				break;
			case 4:
				if (!cadastroVazio()) {	
					System.out.print("- Digite o ID do funcionário: ");
					id = leitor.nextInt();
					leitor.nextLine();
					
					for (class_funcionario funcionario : funcionarios) {
						if (funcionario.getId() == id) {
							System.out.print("- Digite a data de de realização do projeto (dd/mm/yyyy): ");
							String data = leitor.nextLine();
							System.out.print("- Digite o valor pago por hora: R$");
							double valorHora = leitor.nextDouble();
							leitor.nextLine();
							System.out.print("- Digite a quantidade de horas trabalhadas: ");
							int totalHoras = leitor.nextInt();
							leitor.nextLine();
							
							funcionario.adicionarContrato(data, valorHora, totalHoras);
							
							System.out.println(" -> Contrato adicionado.");
							System.out.println("\n ***Pressione ENTER para continuar.");
							leitor.nextLine();
						} 
						
					}
				} else {
					System.out.println(" ***Não funcionários cadastrados. \n");
				}
				break;
			case 5:
				System.out.print("- Digite o ID do funcionário: ");
				id = leitor.nextInt();
				leitor.nextLine();
				
				System.out.print("- Digite o mês que deseja calcular: ");
				int mes = leitor.nextInt();
				leitor.nextLine();
				
				for (class_funcionario funcionario : funcionarios) {
					if (funcionario.getId() == id) {
						System.out.println(" -> Salário: " + funcionario.calcularSalario(mes));
						System.out.println();
					}
				}
				break;
			case 6:
				System.out.println(" ***Sistema finalizado.");
				break;
			default:
				
				break;
			}
		
		} while(opcao != 6);

	leitor.close();

	}

	public static void removerFuncionario(int id) {
		try {
			funcionarios.removeIf(funcionario -> funcionario.getId() == id);
		} catch (Exception e) {
			System.out.println(" ***Algo inesperado ocorreu. Não foi possível remover o funcionário.");
		} finally {
			tabelaFuncionarios();					
		}
	}

	public static void tabelaFuncionarios() {
		if (funcionarios.size() > 0) {
			System.out.println("==================== TABELA DE FUNCIONÁRIOS ====================\n");
			System.out.printf("%-5s | %-15s | %-8s | %-10s | %-5s \n", "ID", "Nome", "Nível", "Salário", "Quantidade de contratos");
			System.out.println("-------------------------------------------------------------------------");
			for (class_funcionario funcionario : funcionarios) {
				System.out.println(funcionario);
			}
			System.out.println("\n *** Aperte ENTER para continuar");
			leitor.nextLine();
		} else {
			System.out.println(" ***Não há funcionários cadastrados.\n");
		}
	}
	
	public static boolean cadastroVazio() {
		if (funcionarios.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
