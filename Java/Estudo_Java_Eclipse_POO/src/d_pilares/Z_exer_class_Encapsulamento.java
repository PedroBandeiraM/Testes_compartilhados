package d_pilares;

import java.util.Scanner;

public class Z_exer_class_Encapsulamento {
// Atributos =====================================================================================
	Scanner leitor = new Scanner(System.in);
	private int idConta;
	private String titular;
	private double saldo;
	private final double TAXA = 5.0;

// Construtores ==================================================================================	
	
	public Z_exer_class_Encapsulamento(int idConta, String titular, double saldo) {
		this(idConta, titular); // Ativa outro constutor (evita repetição)
		this.saldo = saldo;
	} // Contrutor principal
	
	public Z_exer_class_Encapsulamento(int idConta, String titular) {
		this.idConta = idConta;
		this.titular = titular;
	} // Construtor secundário

// Getters e Setters =============================================================================	
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo - TAXA;
	}

	public int getIdConta() {
		return idConta;
	}
	
// Métodos =======================================================================================	
	
	public void info() {
		System.out.printf("""
				%nDados da conta:
				  -> ID: %d
				  -> Titular: %s
				  -> Saldo: R$%.2f
				""", idConta, titular, saldo);
		System.out.printf("%n ***Pressione ENTER para continuar.");
		leitor.nextLine();
	}
}
