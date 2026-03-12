package f_composicao;

public class class_funcionario {
	String nome;
	enum_nivel nivel;
	double salarioBase;
	
	public class_funcionario(String nome, enum_nivel nivel, double salarioBase) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
	}
	
	@Override
	public String toString() {
		return String.format("%-15s | %-8s | R$%-10.2f", nome, nivel, salarioBase);

	}
}
