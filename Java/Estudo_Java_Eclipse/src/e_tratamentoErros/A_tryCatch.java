package e_tratamentoErros;

import java.util.Scanner;

public class A_tryCatch {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	
		try {
			String[] vetor = leitor.nextLine().split(" ");
			int indice = leitor.nextInt();
			leitor.nextLine();
			
			System.out.println(vetor[indice]);
		} catch (Exception e) {
			System.out.println("Erro: " + e);
			System.out.println("Mensagem localizada: " + e.getLocalizedMessage() );
			System.out.println("Mensagem: " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println(" ***Programa finalizado.");
		}
		
		
		leitor.close();
	}
}
