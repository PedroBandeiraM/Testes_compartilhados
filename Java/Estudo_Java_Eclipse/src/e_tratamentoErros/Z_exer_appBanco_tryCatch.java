package e_tratamentoErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Z_exer_appBanco_tryCatch {
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		String titular;
		double saldo = 0, limite = 0, montante = 0;
		int opcao;
		Z_exer_classContaBancaria_tryCatch conta;
		
		while (true) {
			System.out.println("\n=-=-=-=-=-= BANCÃO DO BÃO =-=-=-=-=-= \n");
			
			System.out.print("- Digite seu nome: ");
			titular = leitor.nextLine().trim();
			System.out.print("- Deseja depositar algum valor inicialmente [S/N]?: ");
			char escolha = leitor.next().trim().toUpperCase().charAt(0);
			leitor.nextLine();
			
			try {
				if (escolha == 'S') {
					System.out.print("  -> Digite o depósito inicial: R$");	
					saldo = leitor.nextDouble();
					leitor.nextLine();
				} else if (escolha != 'N') {
					throw new InputMismatchException(" ***O valor digitado foi incorreto \n");
				}
			} catch (InputMismatchException e) {
				System.out.print(e.getMessage());
				pausa();
				continue;
			}
			
			System.out.print("- Digite o limite de saque: R$");
			limite = leitor.nextDouble();
			leitor.nextLine();
			
			if (escolha == 'S') {
				conta = new Z_exer_classContaBancaria_tryCatch(titular, saldo, limite);
			} else {
				conta = new Z_exer_classContaBancaria_tryCatch(titular, limite);
			}
			
			System.out.print("\n ***Conta criada com sucesso. Pressione ENTER para continuar.");
			leitor.nextLine();
			break;
		}
		
		do {
			System.out.println("\n=-=-=-=-=-= BANCÃO DO BÃO =-=-=-=-=-= \n");
						
			System.out.print("""
					Escolha uma opção: 
					  [1] Visualizar dados da conta
					  [2] Depositar
					  [3] Sacar
					  [4] Sair do programa
					  -> """ + " ");
			opcao = leitor.nextInt();
			leitor.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.println("CONTA CADASTRADA: " + conta);
				break;
			case 2:
				System.out.print("- Digite o montante a ser depositado: R$");
				montante = leitor.nextDouble();
				leitor.nextLine();
				conta.depositar(montante);
				System.out.println("  -> Deposito concluido!");
				break;
			case 3:
				try {
					System.out.print("- Digite o montante a ser sacado: R$");
					montante = leitor.nextDouble();
					leitor.nextLine();
					conta.sacar(montante);
					System.out.println("  -> Saque concluido!");
				} catch (Z_exer_classTransacaoInvalida_tryCacth e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println(" ***Programa finalizado.");
				break;	
			default:
				System.out.println(" ***Valor digitado incorreto.Pressione ENTER para tentar novamente.");
				leitor.nextLine();
				break;
			}
			
		} while (opcao != 4);
	}
	
	public static void pausa() {
		System.out.println(" ***Pressione ENTER para continuar.");
		leitor.nextLine();
	}
}
