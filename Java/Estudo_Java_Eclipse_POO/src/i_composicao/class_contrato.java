package i_composicao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class class_contrato {
	LocalDate data;
	double valorHora;
	int totalHoras;
	DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public int getDataMes() {
		return data.getMonthValue();
	}
	
	public class_contrato(String data, double valorHora, int totalHoras) {
		this.data = LocalDate.parse(data, formatador);
		this.valorHora = valorHora;
		this.totalHoras = totalHoras;
		
	}
	
	public double calcularContrato() {
		return valorHora * totalHoras;
	}
}
