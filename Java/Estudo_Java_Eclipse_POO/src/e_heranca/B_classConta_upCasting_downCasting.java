package e_heranca;

public class B_classConta_upCasting_downCasting {
	public String nomeUsuario;
	public int idadeUsuario;

	public B_classConta_upCasting_downCasting() { // Construtor padrão
	}
	
	public B_classConta_upCasting_downCasting(String nomeUsuario, int idadeUsuario) {
		this.nomeUsuario = nomeUsuario;
		this.idadeUsuario = idadeUsuario;
	}
	
	@Override
	public String toString() {
		StringBuilder texto = new StringBuilder();
		texto.append("NOME: ");
		texto.append(nomeUsuario);
		texto.append(" | IDADE: ");
		texto.append(idadeUsuario);
		
		return texto.toString();
	}
}
