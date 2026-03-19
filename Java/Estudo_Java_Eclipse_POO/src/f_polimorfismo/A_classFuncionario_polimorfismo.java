package f_polimorfismo;

public class A_classFuncionario_polimorfismo {
	String nome;
	Integer horasTrabalhadas;
	Double valorHora;
	
	public A_classFuncionario_polimorfismo() { // Construtor padrão
	}
	
	public A_classFuncionario_polimorfismo(String nome, Integer horasTrabalhadas, Double valorHora) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	
	public double calcularPagamento() {
		return horasTrabalhadas * valorHora;
	}
	
	@Override // Sobrescreve o método da classe padrão Object
	public String toString() {
		StringBuilder texto = new StringBuilder();
		texto.append("Nome: ");
		texto.append(nome);
		texto.append(" | Salário: ");
		texto.append(String.format("%.2f", calcularPagamento()));
		
		return texto.toString();
	}
}
