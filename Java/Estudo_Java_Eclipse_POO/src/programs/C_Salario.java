package programs;

import java.util.Scanner;
import entities.C_class_Salario;

public class C_Salario {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = leitor.nextLine();
		System.out.print("Digite o salário: ");
		double salario = leitor.nextDouble();
		
		C_class_Salario funcionario = new C_class_Salario(nome, salario);
		
		System.out.print("Digite a taxa (imposto): ");
		double imposto = leitor.nextDouble();
		
		funcionario.aplicarTaxa(imposto, "decrescimo");
		
		funcionario.info();
		
		System.out.print("Digite a taxa (aumento): ");
		double taxa = leitor.nextDouble();
		
		funcionario.aplicarTaxa(taxa, "acrescimo");
		
		funcionario.info();
		
		leitor.close();
	}

}
