package d_estruturaDados;

public class Z_exer_class_lista_funcionarios {
	private String nome;
	private int id; 
	private static int totalFuncionarios = 0;
	private double salario;
	
	public Z_exer_class_lista_funcionarios(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		this.id = totalFuncionarios;
		totalFuncionarios++;
	}
	
	public void aumentarSalario(double aumento) {
		salario += aumento;
	}
	
	public String toString() {
		return "ID: "
				+ id
				+ " | Nome: "
				+ nome
				+ " | Salário: "
				+ salario;
	}
}
