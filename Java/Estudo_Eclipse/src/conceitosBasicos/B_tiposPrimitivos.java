package conceitosBasicos;

import java.util.Scanner;

public class B_tiposPrimitivos {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = leitor.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = leitor.nextInt();
		
		leitor.nextLine();
		
		System.out.println("Digite sua altura: ");
		double altura = leitor.nextDouble();
		
		leitor.nextLine();
		
		System.out.println("Digite o gênero [M/F]: ");
		char gen = leitor.nextLine().charAt(0);
		
		boolean sono = true;
		
		System.out.println();
		System.out.printf("Nome: %s %nIdade: %d %nAltura: %f %nGênero: %s %nSono: %b", nome, idade, altura, gen, sono);
		
		leitor.close();
	}
}
