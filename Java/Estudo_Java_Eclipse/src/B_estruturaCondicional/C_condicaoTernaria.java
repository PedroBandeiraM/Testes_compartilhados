package B_estruturaCondicional;

import java.util.Scanner;

public class C_condicaoTernaria {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Você possui cabelo [s/n]? ");
		String cabelo = leitor.nextLine();
		
		String output = (cabelo == "s") ? "Que bom!" : "Use os produtos da Manual!";
		System.out.println(output);
		
		leitor.close();
	}
}
