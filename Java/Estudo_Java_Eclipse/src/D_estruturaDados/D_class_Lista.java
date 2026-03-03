package D_estruturaDados;

import java.util.List;

public class D_class_Lista {
	String nome;
	int id;
	double media;
	static int alunosQuantidade = 0;

	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}
	
	public D_class_Lista(String nome, List<Double> notas) {
		this.nome = nome;
		this.media = somaLista(notas) / notas.size();
		this.id = alunosQuantidade;
		alunosQuantidade++;
	}
	
	public static double somaLista(List<Double> lista) {
		double soma = 0;
		for (double item : lista) {
			soma += item;
		}
		return soma;
	}
	
	public String toString() {
		return String.format("%-5d | %-15s | %-5.2f", id, nome, media);
	}
	
}
