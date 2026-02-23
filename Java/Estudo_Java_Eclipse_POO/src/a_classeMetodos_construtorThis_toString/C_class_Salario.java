package a_classeMetodos_construtorThis_toString;

public class C_class_Salario {
	String nome;
	double salarioBruto;
	double salarioLiquido;
	
	public C_class_Salario(String nome, double salario) {
		this.nome = nome;
		this.salarioBruto = salario;
		this.salarioLiquido = this.salarioBruto;
	}
	
	public void aplicarTaxa(double taxa, String tipo) {
		if (tipo == "acrescimo") {
			salarioLiquido += salarioBruto * (taxa / 100);
		} 
		else if (tipo == "decrescimo") {
			salarioLiquido -= salarioBruto * (taxa / 100);
		}
	}
	
	public void info() {
		System.out.printf("""  
				  -> Funcionário: %s
				  -> Salário: %.2f
				""", nome, salarioLiquido);
	}
	
}
