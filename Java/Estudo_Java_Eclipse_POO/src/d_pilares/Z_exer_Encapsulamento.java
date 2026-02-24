package d_pilares;

import java.util.Scanner;

public class Z_exer_Encapsulamento {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Z_exer_class_Encapsulamento contaBancaria;
		int idConta;
		String titular;
		double saldo;
		double depositoSaque;
		byte opcao;
		char escolha;
		
		System.out.println("========== Banco do zé ==========");
		
		System.out.printf("%nDigite o número de sua conta: ");
		idConta = leitor.nextInt();
		leitor.nextLine();
		
		System.out.print("Digite seu nome: ");
		titular = leitor.nextLine();
		
		while (true) {
			System.out.print("Deseja depositar um valor inicial [S/N]? ");
			escolha = leitor.next().trim().toUpperCase().charAt(0);
			
			if (escolha == 'S') {
				System.out.print(" - Digite o valor a ser depositado: R$");
				saldo = leitor.nextDouble();
				leitor.nextLine();
				contaBancaria = new Z_exer_class_Encapsulamento(idConta, titular, saldo);
				break;
			} 
			else if (escolha == 'N') {
				contaBancaria = new Z_exer_class_Encapsulamento(idConta, titular);
				break;
			} 
			else {
				System.out.println(" ***Valor digitado incorreto. Tente novamente.");
			}
		}
			
		do {
			System.out.printf("""
					%nEscolha uma opção: 
					  [1] Ver informçãoes
					  [2] Depositar
					  [3] Sacar
					  [4] Alterar nome do titular
					  [5] Sair
					->		""");
			opcao = leitor.nextByte();
			leitor.nextLine();
			System.out.println();
			
			switch (opcao) {
			case 1:
				contaBancaria.info();
				break;
			case 2:
				System.out.print(" - Digite o valor a ser depositado: R$");
				depositoSaque = leitor.nextDouble();
				saldo = contaBancaria.getSaldo() + depositoSaque;
				contaBancaria.setSaldo(saldo);
				contaBancaria.info();
				break;
			case 3:
				System.out.print(" - Digite o valor a ser sacado: R$");
				depositoSaque = leitor.nextDouble();
				saldo = contaBancaria.getSaldo() - depositoSaque;
				contaBancaria.setSaldo(saldo);
				contaBancaria.info();
				break;
			case 4:
				System.out.print(" - Digite o nome novo do titular: ");
				titular = leitor.nextLine();
				contaBancaria.setTitular(titular);
				contaBancaria.info();
				break;
			case 5:
				System.out.println(" ***Sistema encerrado.");
				break;
			default:
				System.out.println(" ***Valor digitado incorreto. Tente novamente.");
				break;
			}
		} while (opcao != 5);
		
		leitor.close();
	}

}
