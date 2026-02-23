package c_sobrecarga;

import java.util.Scanner;

public class F_ContaBancaria {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		F_class_ContaBancaria conta;
		
		System.out.print("Digite o nome: ");
		String nome = leitor.nextLine();
		System.out.print(" - Deseja digitar seu saldo [S/N]? ");
		char continuar = leitor.next().trim().toUpperCase().charAt(0);
		
		if (continuar == 'S') {
			System.out.print("Digite o saldo: R$");
			double saldo = leitor.nextDouble();
			conta = new F_class_ContaBancaria(nome, saldo); // Chama construtor com 2 parâmetros
		} else {
			conta = new F_class_ContaBancaria(nome); // Chama construtor com 1 parâmetro
		}
		
		System.out.println(conta);
		
		leitor.close();
	}

}
