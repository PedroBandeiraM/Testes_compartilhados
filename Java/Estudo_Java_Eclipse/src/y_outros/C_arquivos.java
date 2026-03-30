package y_outros;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class C_arquivos {

	public static void main(String[] args) throws InterruptedException {
		Scanner leitorArquivo;
		File arquivo = new File("C:\\Users\\pedro.mari\\OneDrive - Grupo TB\\Área de Trabalho\\Programação\\Aleatoriedades 2.0\\teste_comandosJavaArquivo.txt");
		
		try {
			leitorArquivo = new Scanner(arquivo);
			while (leitorArquivo.hasNextLine()) {
				System.out.println(leitorArquivo.nextLine());
				TimeUnit.SECONDS.sleep(1);
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
