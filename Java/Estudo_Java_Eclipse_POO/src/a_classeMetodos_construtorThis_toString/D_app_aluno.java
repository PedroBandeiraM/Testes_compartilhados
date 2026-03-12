package a_classeMetodos_construtorThis_toString;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class D_app_aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		List<Double> notas = new ArrayList<>();
		
		System.out.print("Digite o nome do aluno: ");
		String nome = leitor.nextLine();
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("- Digite a " + i + "º nota: ");
			double nota = leitor.nextDouble();
			notas.add(nota);
		}
		
		D_class_aluno aluno = new D_class_aluno(nome, notas);
		
		aluno.media();
		aluno.situacao();
		
		leitor.close();
	}

}
