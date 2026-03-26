package e_tratamentoErros;

public class Z_exer_classDataInvalida extends Exception {
	
	private static final long serialVersionUID = 1L; // ID que indica a versão da classe (serializable)

	public Z_exer_classDataInvalida() {
		super(" ***As datas são inválidas!");
	}
	
	public Z_exer_classDataInvalida(String mensagem) {
		super(mensagem);
	}
}
