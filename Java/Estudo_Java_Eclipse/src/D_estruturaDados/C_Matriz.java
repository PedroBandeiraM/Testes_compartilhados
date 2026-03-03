package D_estruturaDados;

import java.util.Scanner;

public class C_Matriz {
	static int[][] matriz;
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int m, n, num;
		
		System.out.print("Digite a quantidade de linhas (m): ");
		m = leitor.nextInt();
		leitor.nextLine();
		System.out.print("Digite a quantidade de colunas (n): ");
		n = leitor.nextInt();
		//leitor.nextLine();
		
		matriz = new int[m][n];
		
		System.out.println("Construa a matriz com seus valores: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = leitor.nextInt();
			}
		}
		leitor.nextLine();
		
		System.out.print("\nEscreva um valor encontrado na matriz: ");
		num = leitor.nextInt();
		leitor.nextLine();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == num) {
					System.out.println(" - Coordenadas: (" + i + ", " + j + ")");
					if (i > 0) {
						System.out.println(" - Cima: " + matriz[i - 1][j]);
					}
					
					if (i < (matriz.length - 1)) {
						System.out.println(" - Baixo: " + matriz[i + 1][j]);
					}
					
					if (j < (matriz[i].length - 1)) {
						System.out.println(" - Direita: " + matriz[i][j + 1]);
					}
					
					if (j > 0) {
						System.out.println(" - Esquerda: " + matriz[i][j - 1]);
					}
				}
			}
		}
		
		leitor.close();
	}
	
}
