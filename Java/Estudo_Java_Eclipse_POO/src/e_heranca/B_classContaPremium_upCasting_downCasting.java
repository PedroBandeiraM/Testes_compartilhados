package e_heranca;

public class B_classContaPremium_upCasting_downCasting extends B_classConta_upCasting_downCasting {
	int numeroCartao;
	
	public B_classContaPremium_upCasting_downCasting(String nomeUsuario, int idadeUsuario, int numeroCartao) {
		super(nomeUsuario, idadeUsuario);
		this.numeroCartao = numeroCartao;
	}
	
	public void baixarConteudo() {
		System.out.println(" -> Conteúdo baixado!");
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
		
		return texto.toString();
	}
	
}
