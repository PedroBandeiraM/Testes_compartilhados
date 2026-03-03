package D_estruturaDados;

import java.util.Scanner;
import java.util.List; // Interface
import java.util.ArrayList; // Classe

public class Z_exer_lista_Funcionarios {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		List<Z_exer_class_lista_Funcionarios> funcionarios = new ArrayList<>();
		String nome;
		int opcao, id;
		double salario;
		
		do {
			System.out.println("\n=-=-=-=-=-= Funcionários =-=-=-=-=-=\n");
			
			System.out.print("""
					Escolha uma opção:
					  [1] Adicionar funcionário
					  [2] Remover funcionário
					  [3] Aumento salarial
					  [4] Tabela de funcionários
					  [5] Sair
					  -> """ + " ");
			opcao = leitor.nextInt();
			leitor.nextLine();
			System.out.println();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite o nome: ");
				nome = leitor.nextLine();
				System.out.print("Digite o salário: ");
				salario = leitor.nextDouble();
				leitor.nextLine();
				funcionarios.add(new Z_exer_class_lista_Funcionarios(nome, salario));
				System.out.println(" -> FUNCIONÁRIO ADICIONADO");
				break;
			case 2:
				System.out.print("Digite o ID: ");
				id = leitor.nextInt();
				leitor.nextLine();
				
				funcionarios.remove(id);
				System.out.println(" -> FUNCIONÁRIO REMOVIDO");
				break;
			case 3:
				System.out.print("Digite o ID: ");
				id = leitor.nextInt();
				leitor.nextLine();
				System.out.print("Digite o aumento: R$");
				double aumento = leitor.nextDouble();
				leitor.nextLine();
				
				funcionarios.get(id).aumentarSalario(aumento);
				System.out.println(" -> MODIFICAÇÃO REALIZADA COM SUCESSO.");
				break;
			case 4:
				for (Z_exer_class_lista_Funcionarios funcionario : funcionarios) {
					System.out.println(funcionario);					
				}
				System.out.println("\n ***Precione ENTER para continuar.");
				leitor.nextLine();
				break;
			case 5:
				System.out.println(" ***Programa encerrado.");
				break;
			default:
				System.out.println(" ***Valor digitado incorreto. Tente novamente.");
				break;
			}
			
		} while (opcao != 5);
		
		leitor.close();
	}
}
