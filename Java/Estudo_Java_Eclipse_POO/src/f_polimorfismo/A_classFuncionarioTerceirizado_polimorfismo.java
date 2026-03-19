package f_polimorfismo;

public class A_classFuncionarioTerceirizado_polimorfismo extends A_classFuncionario_polimorfismo {
	Double taxaAdicional;
	
	public A_classFuncionarioTerceirizado_polimorfismo(String nome, Integer horasTrabalhadas, Double valorHora, Double taxaAdicional) {
		super(nome, horasTrabalhadas, valorHora);
		this.taxaAdicional = taxaAdicional;
	}
	
	@Override // Sobrescreve método da classe pai
	public double calcularPagamento() {
		Double salario = super.calcularPagamento(); // Evita recursão infinita
		return salario + (salario * (taxaAdicional / 100));
	}
}
