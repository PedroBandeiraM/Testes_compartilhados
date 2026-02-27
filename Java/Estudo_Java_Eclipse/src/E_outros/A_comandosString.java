package E_outros;

import java.util.Scanner;

public class A_comandosString {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
//		System.out.print("Digite um texto (string) que será formatado: ");
//		String texto = leitor.nextLine();
		
		String texto = "   Atirei o PAU no GaTo   ";
		
		String maiusculo = texto.toUpperCase();
		String minusculo = texto.toLowerCase();
		String sem_espacos = texto.trim();
		String fatiamento_1 = texto.trim().substring(7);
		String fatiamento_2 = texto.trim().substring(9, 12);
		String troca = texto.replace("Atirei o PAU", "Fiz carinho");
		int posicao_gato = texto.trim().indexOf("GaTo"); // .lastIndexOf() -> Indica a última aparição
		
		String[] vetor = texto.trim().split(" ");
		String pal_1 = vetor[0];
		String pal_2 = vetor[1];
		
		System.out.println("A palvara é: " + texto);
		
		System.out.printf("""
				\nFormatações: 
				  -> Maiúsculo: %s  
				  -> Minúsculo: %s
				  -> Sem espaços: %s
				  -> Fatiamento 1 (sem espaços): %s
				  -> Fatiamento 2 (sem espaços): %s
				  -> Troca: %s
				  -> Posição do gato (sem espaços): %s
				  -> Vetor (sem espaços): 
				     - Palavra 1: %s
				     - Palvrava 2: %s
				\n """, maiusculo, minusculo, sem_espacos, fatiamento_1, fatiamento_2, troca, posicao_gato, pal_1, pal_2);
		
		leitor.close();
	}

}
