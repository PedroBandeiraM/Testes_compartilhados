package g_abstracao;

public class Z_exer_classPessoaJuridica_abstracao extends Z_exer_classContribuinte_abstracao {
	private double quantidadeFuncionarios;
	
	public Z_exer_classPessoaJuridica_abstracao(String nome, double rendaAnual, int quantidadeFuncionarios) {
		super(nome, rendaAnual);
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}
	
	@Override
	public double calcularImposto() {
		if (quantidadeFuncionarios > 10) {
			return rendaAnual * 0.14;
		} else {
			return rendaAnual * 0.16;
		}
	}
}
