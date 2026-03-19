package f_polimorfismo;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class A_app_polimorfismo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		List<A_classFuncionario_polimorfismo> funcionarios = new ArrayList<>(); // Aceita apenas objetos do tipo Fucnionário, por isso é necessário fazer um UpCasting de FuncionárioTerceirizado
		
		System.out.println(" -> FUNCIONÁRIOS: \n");
		System.out.print("Digite quantos funcionários deseja adicionar: ");
		int quantidade = leitor.nextInt();
		leitor.nextLine();
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println("\n- FUNCIONÁRIO " + (i + 1) + ":");
			System.out.print("Funcionário terceirizado [S/N]: ");
			char opcao = leitor.nextLine().trim().toUpperCase().charAt(0);
			System.out.print("Nome: ");
			String nome = leitor.nextLine();
			System.out.print("Horas trabalhadas: ");
			int horasTrabalhadas = leitor.nextInt();
			leitor.nextLine();
			System.out.print("Valor por hora: R$");
			double valorHora = leitor.nextDouble();
			leitor.nextLine();
			
			if (opcao == 'S') {
				System.out.print("Taxa adicional (terceirização): ");
				double taxaAdicional = leitor.nextDouble();
				leitor.nextLine();
				funcionarios.add(new A_classFuncionarioTerceirizado_polimorfismo(nome, horasTrabalhadas, valorHora, taxaAdicional)); // UpCasting
			} else {
				funcionarios.add(new A_classFuncionario_polimorfismo(nome, horasTrabalhadas, valorHora)); // Instanciação normal
			}
			
		}
		System.out.println();
		System.out.println(" -> PAGAMENTOS: \n");
		
		for (A_classFuncionario_polimorfismo funcionario : funcionarios) { // Considera todos os itens como Funcionário, onde FuncionárioTerceirizado resultaria em erro
			System.out.println(funcionario);
		}
		leitor.close();
	}

}
