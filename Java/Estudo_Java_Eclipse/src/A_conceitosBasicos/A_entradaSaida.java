package A_conceitosBasicos;

import java.util.Scanner;

public class A_entradaSaida {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = leitor.nextLine();
	
		System.out.println();
		System.out.printf("Nome: " + nome);
		
		leitor.close();
	}
}
