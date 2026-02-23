package entities;

import java.util.List;

public class D_class_Aluno {
	String nome;
	List<Double> notas;
	double media;
	
	public D_class_Aluno(String nome, List<Double> notas) {
		this.nome = nome;
		this.notas = notas;
	}
	
	public void media() {
		int quantidade = notas.size();
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		media = soma / quantidade;
	}
	
	public void situacao() {
		System.out.printf(" -> Média: %.2f %n", media);
		if (media >= 6.0) {
			System.out.println(" -> O aluno está APROVADO!");
		}
		else {
			System.out.println(" -> O aluno está REPROVADO.");
		}
	}
}
