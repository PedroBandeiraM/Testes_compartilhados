package D_estruturaDados;

public class Z_exer_class_vetor_PencaoInquilino {
	String nome, email;
	int numQuarto;

	public Z_exer_class_vetor_PencaoInquilino(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public void alugarQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}
	
	public String toString() {
		return "Nome: "
				+ nome  
				+ " | E-mail: "
				+ email 
				+ " | Quarto: "
				+ numQuarto
				+ ".";
	}

}
