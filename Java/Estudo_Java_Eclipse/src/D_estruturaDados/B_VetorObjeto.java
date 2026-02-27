package D_estruturaDados;

import java.util.Scanner;

public class B_VetorObjeto {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		B_class_VetorObjeto[] profissionais = new B_class_VetorObjeto[2];
		String nome, profissao;
		double salario;
		
		for (int i = 0; i < profissionais.length; i++) {
			System.out.print("Digite o nome do " + (i + 1) + " profissional: ");
			nome = leitor.nextLine();
			System.out.print("Digite a profissão do " + (i + 1) + " profissional: ");
			profissao = leitor.nextLine();
			System.out.print("Digite o salário do " + (i + 1) + " profissional: ");
			salario = leitor.nextDouble();
			leitor.nextLine();
			
			profissionais[i] = new B_class_VetorObjeto(nome, profissao, salario);
			
			System.out.println();
		}
		
		System.out.println("----------------------------------------\n");
		
		for (int i = 0; i < profissionais.length; i++) {
			System.out.println(profissionais[i]);
		}
		
		leitor.close();
	}

}
