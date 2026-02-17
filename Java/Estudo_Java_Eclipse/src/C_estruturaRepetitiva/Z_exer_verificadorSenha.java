package C_estruturaRepetitiva;

import java.util.Scanner;

public class Z_exer_verificadorSenha {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a nova senha: ");
		String senha_cadastrada = leitor.nextLine();
		String senha_tentativa = "0";
		
		System.out.printf("%n-------------------------------------%n%n");
		
		while (!senha_cadastrada.equals(senha_tentativa)) {
			System.out.print("Digite a senha para fazer login: ");
			senha_tentativa = leitor.nextLine();
			
			if (!senha_cadastrada.equals(senha_tentativa)) {
				System.out.printf(" -> A senha está incorreta. Tente novamente. %n%n");
			}
			
		}
		System.out.print("Senha correta!");
		
		leitor.close();
	}

}
