package a_classeMetodos_construtorThis_toString;

import java.util.Scanner;

public class C_app_salario {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = leitor.nextLine();
		System.out.print("Digite o salário: ");
		double salario = leitor.nextDouble();
		
		C_class_salario funcionario = new C_class_salario(nome, salario);
		
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
