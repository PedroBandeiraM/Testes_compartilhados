package e_heranca;

public class B_app_upCasting_downCasting {

	public static void main(String[] args) {
		B_classConta_upCasting_downCasting conta = new  B_classConta_upCasting_downCasting("George", 20);
		B_classContaPremium_upCasting_downCasting contaPremium = new B_classContaPremium_upCasting_downCasting("Amanda", 17, 789);
		B_classContaEmpresarial_upCasting_downCasting contaEmpresarial = new B_classContaEmpresarial_upCasting_downCasting("Samuel", 34, 456, "samuel.silva@empresaFoda.com.br");
		
		System.out.println(conta + "\n" + contaPremium +  "\n" + contaEmpresarial);
		
		B_classConta_upCasting_downCasting contaPremiumUp = contaPremium;
		B_classConta_upCasting_downCasting contaEmpresarialUp = contaEmpresarial;
		
		System.out.println("======================================================");
		System.out.println(conta + "\n" + contaPremiumUp +  "\n" + contaEmpresarialUp); // toString acessa o objeto real (teste para entender)
		System.out.println("======================================================");

		
		contaPremium.baixarConteudo(); // Acessa normalmente
		// contaPremiumUp.baixarConteudo(); // ----> Não enxerga o método da classe filha
		
		B_classContaEmpresarial_upCasting_downCasting contaEmpresarialDown = (B_classContaEmpresarial_upCasting_downCasting) contaEmpresarialUp;
		
		contaEmpresarial.adicionarConteudo();
		contaEmpresarialDown.adicionarConteudo(); // Converter para a classe filha possivbilitou enxergar novamente o método
	}

}
