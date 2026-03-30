package e_tratamentoErros;

import java.util.Random;

public class Z_exer_classContaBancaria_tryCatch {
	private String titular;
	private Double saldo, limite;
	private Integer numConta;
	Random random = new Random();
	
	public Z_exer_classContaBancaria_tryCatch(String titular, double saldo, double limite) {
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
		this.numConta = random.nextInt(1_000_000) + 1_000;
	}
	
	public Z_exer_classContaBancaria_tryCatch(String titular, double limite) {
		this.titular = titular;
		this.saldo = 0.0;
		this.limite = limite;
		this.numConta = random.nextInt(1_000_000) + 1_000;
	}
	
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
	
	public void sacar(double montante) throws Z_exer_classTransacaoInvalida_tryCacth {
		if (limite < montante) {
			throw new Z_exer_classTransacaoInvalida_tryCacth(" ***TRANSAÇÃO INVÁLIDA: O valor requisitado é maior que o limite da conta.");
		} else if (saldo < montante) {
			throw new Z_exer_classTransacaoInvalida_tryCacth(" ***TRANSAÇÃO INVÁLIDA: O valor requisitado é maior que o saldo da conta."); 
		} else if (montante <= 0) {
			throw new Z_exer_classTransacaoInvalida_tryCacth(" ***TRANSAÇÃO INVÁLIDA: O valor requisitado deve ser maior que 0");
		} else {
			this.saldo -= montante;
		}
	}
	
	public String toString() {
		StringBuilder texto = new StringBuilder();
		
		texto.append("-> Número da conta: ");
		texto.append(numConta);
		texto.append(" | Nome: ");
		texto.append(titular);
		texto.append(" | Saldo: R$");
		texto.append(String.format("%.2f", saldo));
		texto.append(" | Limite: R$");
		texto.append(String.format("%.2f", limite));
		
		return texto.toString();
	}
	
}
