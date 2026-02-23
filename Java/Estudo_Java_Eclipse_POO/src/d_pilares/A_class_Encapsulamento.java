package d_pilares;

import java.util.List;

public class A_class_Encapsulamento {
	private List<String> nomes;
	private List<Integer> ids;
	
	public A_class_Encapsulamento(List<String> nome, List<Integer> id) {
		this.nomes = nome;
		this.ids = id;
	}
	
	public String getNome(int id) {
		id -= 1;
		return nomes.get(id);
	}
	
	public void setNome(int id, String nome) {
		id -= 1;
		this.nomes.set(id, nome);
	}
	
	public int getId(String nome) {
		int indice = nomes.indexOf(nome);
		
		if (indice >= 0) {
			return ids.get(indice);
		} else {
			return -1;
		}
	}
	
	public void info() {
		int quantidade = nomes.size();
		System.out.println();
		for (int i = 0; i < quantidade; i++) {
			System.out.println(ids.get(i) + " | " + nomes.get(i));
		}
	
	}
}
