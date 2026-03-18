package e_heranca;

public class B_classContaEmpresarial_upCasting_downCasting extends B_classConta_upCasting_downCasting {
	public String emailCorporativo;
	int numeroCartao;
	
	public B_classContaEmpresarial_upCasting_downCasting(String nomeUsuario, int idadeUsuario, int numeroCartao, String emailCorporativo) {
		super(nomeUsuario, idadeUsuario);
		this.numeroCartao = numeroCartao;
		this.emailCorporativo = emailCorporativo;
	}
	
	public void adicionarConteudo() {
		System.out.println(" -> Conteúdo adicionado a playlist!");
	}
	
	@Override
	public String toString() {
		StringBuilder texto = new StringBuilder();
		texto.append("NOME: ");
		texto.append(nomeUsuario);
		texto.append(" | IDADE: ");
		texto.append(idadeUsuario);
		texto.append(" | NÚMERO DO CARTÃO: ");
		texto.append(numeroCartao);
		texto.append(" | EMAIL CORPORATIVO: ");
		texto.append(emailCorporativo);
		
		return texto.toString();
	}
	
}
