package g_abstracao;

public class Z_exer_classPessoaFisica_abstracao extends Z_exer_classContribuinte_abstracao {
	private double gastosSaude;
	
	public Z_exer_classPessoaFisica_abstracao(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public double calcularImposto() {
		double imposto = 0;
		if (rendaAnual < 20_000.00) {
			imposto += rendaAnual * 0.15;
		} else {
			imposto += rendaAnual * 0.25;
		}
		if (gastosSaude != 0) {
			imposto -= gastosSaude * 0.5;
		}
		return imposto;
	}
}
