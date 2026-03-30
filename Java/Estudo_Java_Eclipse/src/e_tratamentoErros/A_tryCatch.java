package e_tratamentoErros;

import java.util.Scanner;

public class A_tryCatch {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	
		try {
			System.out.print("Digite nomes separados por espaço: ");
			String[] vetor = leitor.nextLine().split(" ");
			System.out.print("Digite a posição do nome que deseja ver: ");
			int indice = leitor.nextInt();
			leitor.nextLine();
			
			System.out.println(" - Nome: " + vetor[indice]);
		} catch (Exception e) {
			System.out.println("\nnErro: " + e);
			System.out.println("Mensagem: " + e.getMessage());
			System.out.println("Erro completo:");
			e.printStackTrace();
		} finally {
			System.out.println("\n ***Programa finalizado.");
		}
		
		
		leitor.close();
	}
}
