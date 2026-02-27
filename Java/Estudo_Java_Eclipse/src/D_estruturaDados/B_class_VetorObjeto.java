package D_estruturaDados;

public class B_class_VetorObjeto {
	String nome, profissao;
	double salario;
	
	public B_class_VetorObjeto(String nome, String profissao, double salario) {
		this.nome = nome;
		this.profissao = profissao;
		this.salario = salario;
	}
	
	public String toString() {
		return String.format("""
				- Nome: %s
				- Profissão: %s
				- Salário: R$%.2f
				""", nome, profissao, salario);
	}
	
}
