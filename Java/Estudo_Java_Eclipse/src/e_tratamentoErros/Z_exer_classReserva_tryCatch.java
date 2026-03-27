package e_tratamentoErros;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Z_exer_classReserva_tryCatch extends Z_exer_app_tryCatch {
	private Integer numQuarto;
	private LocalDate checkIn, checkOut;
	
	public Z_exer_classReserva_tryCatch(int numQuarto, LocalDate checkIn, LocalDate checkOut) {
		this.numQuarto = numQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Integer duracao() {
		return (int) ChronoUnit.DAYS.between(checkIn, checkOut);
	}
	
	public static Integer duracao(LocalDate d1, LocalDate d2) {
		return (int) ChronoUnit.DAYS.between(d1, d2);
	}
	
	public void atualizarDatas(LocalDate novoCheckIn, LocalDate novoCheckOut) { // throws não é necessário, pois a exceção é tratada com try-catch
		try {
			if (duracao(novoCheckIn, novoCheckOut) == 0) {
				throw new Z_exer_classDataInvalida(" ***A duração da hospedagem deve ser de no mínimo 1 dia");
			}
			else if (novoCheckIn.isBefore(LocalDate.now())) {
				throw new Z_exer_classDataInvalida(" ***A nova data de check-in é inválida: A data deve ser maior que a data atual");
			} 
			else if (novoCheckOut.isBefore(novoCheckIn)){
				throw new Z_exer_classDataInvalida(" ***As novas data são inválidas: A data de check-in deve ser menor que a data de check-out");
			} 
			else {
				this.checkIn = novoCheckIn;
				this.checkOut = novoCheckOut;
				System.out.println(" ***Datas atualizadas com sucesso!");
			}
		} catch (Z_exer_classDataInvalida e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String toString() {
		StringBuilder texto = new StringBuilder();
		
		texto.append(" -> Cadastro: Número do quarto: ");
		texto.append(numQuarto);
		texto.append(" | Check-in: ");
		texto.append(checkIn.format(formatador));
		texto.append(" | Check-out: ");
		texto.append(checkOut.format(formatador));
		texto.append(" | Duração da hospedagem: ");
		texto.append(duracao());
		
		return texto.toString();
	}
}
