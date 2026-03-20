package g_abstracao;

public abstract class Z_exer_classContribuinte_abstracao {
	String nome;
	Double rendaAnual;
	
	public Z_exer_classContribuinte_abstracao() {
	}
	
	public Z_exer_classContribuinte_abstracao(String nome, double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double calcularImposto(); // Permite que classes filhas criem seus próprios métodos
	
	@Override
	public String toString() {
		StringBuilder texto = new StringBuilder();
		texto.append("Nome: ");
		texto.append(String.format("%-10s", nome));
		texto.append(" | Renda anual: R$");
		texto.append(String.format("%-8.2f", rendaAnual));
		texto.append(" | Imposto: R$");
		texto.append(String.format("%-8.2f", calcularImposto()));
		
		return texto.toString();
	}
}
