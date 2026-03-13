package f_composicao;

import java.util.List;
import java.util.ArrayList;

public class class_funcionario {
	private static int quantidadeFuncionarios = 0;
	private String nome;
	private enum_nivel nivel;
	private int id;
	private double salarioBase;
	private List<class_contrato> contratos = new ArrayList<>();

	
	public int getId() {
		return id;
	}
	
	public class_funcionario(String nome, enum_nivel nivel, double salarioBase) {
		quantidadeFuncionarios += 1;
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.id += quantidadeFuncionarios;
	}
	
	public void adicionarContrato(String data, double valorHora, int totalHoras) {
		this.contratos.add(new class_contrato(data, valorHora, totalHoras));
	}
	
	public double calcularSalario(int mes) {
		if (contratos.size() > 0) {
			double somaSalario = 0;
			for (class_contrato contrato : contratos) {	
				if (contrato.getDataMes() == mes) {
					somaSalario += salarioBase + contrato.calcularContrato();
					System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
				} else {
					somaSalario += salarioBase;
					System.out.println("bbbbbbbbbbbbbbbbbb");
				}
			}
			return somaSalario;
		} else {
			return salarioBase;
		}
	}
	
	@Override
	public String toString() {
		try {
			return String.format("%-5d | %-15s | %-8s | R$%-8.2f | %-5d", id, nome, nivel, salarioBase, contratos.size());
		} catch (NullPointerException e) {
			return " ***Erro inesperado.";
		}
	}
}
