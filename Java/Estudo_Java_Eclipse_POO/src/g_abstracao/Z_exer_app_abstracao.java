package g_abstracao;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Z_exer_app_abstracao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		List<Z_exer_classContribuinte_abstracao> contribuintes = new ArrayList<>(); // Aceita apenas itens do tipo contribuinte
		
		System.out.println("==================== ÁREA DE CONTRIBUINTES ==================== \n");
		System.out.print("Digite quantos contribuintes deseja verificar: ");
		int quantidade = leitor.nextInt();
		leitor.nextLine();
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println("\nCONTRIBUINTE " + (i + 1) + ":");
			System.out.print(" - O contribuinte é pessoa física ou jurídica (F/J): ");
			char tipoContribuinte = leitor.nextLine().trim().toUpperCase().charAt(0);
			
			System.out.print(" - Digite o nome do " + (i + 1) +"º: ");
			String nome = leitor.nextLine();
			System.out.print(" - Digite a renda anual do " + (i + 1) +"º: R$");
			double rendaAnual = leitor.nextDouble();
			leitor.nextLine();
			
			if (tipoContribuinte == 'F') {
				System.out.print(" - Digite a quantidade de gastos com saúde do " + (i + 1) +"º: R$");
				double gastosSaude = leitor.nextDouble();
				leitor.nextLine();
				contribuintes.add(new Z_exer_classPessoaFisica_abstracao(nome, rendaAnual, gastosSaude)); // Upcasting
			} else if (tipoContribuinte == 'J') {
				System.out.print(" - Digite a quantidade de funcionário do " + (i + 1) + "º: ");
				int quantidadeFuncionarios = leitor.nextInt();
				leitor.nextLine();
				contribuintes.add(new Z_exer_classPessoaJuridica_abstracao(nome, rendaAnual, quantidadeFuncionarios)); // Upcasting
			}
		}
		
		System.out.println("\n====================== ÁREA DE IMPOSTO ====================== \n");
		for (Z_exer_classContribuinte_abstracao contribuinte : contribuintes) { // Necessário corresponder ao tipo do for each
			System.out.println(contribuinte);
		}
		
		leitor.close();
	}

}
