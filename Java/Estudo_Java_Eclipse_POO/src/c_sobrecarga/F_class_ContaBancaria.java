/*
 * Conceitos:
 * 	- Sobrecarga: 2 métodos ede mesmo nome, mas com diferentes parâmetros e execuções
 */

package c_sobrecarga;

public class F_class_ContaBancaria {
	String nome;
	double saldo;
	
	public F_class_ContaBancaria(String nome) {
		this.nome = nome;
		this.saldo = 0.0;
	}
	
	public F_class_ContaBancaria(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public String toString() {
		return String.format("""
				%nInformações:
				  -> Nome: %s
				  -> Saldo: R$%.2f
				""", nome, saldo);
	}
	
}
