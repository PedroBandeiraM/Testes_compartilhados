package e_tratamentoErros;

import java.time.LocalDate;
import java.time.Period;

public class Z_exer_classReserva_tryCatch extends Z_exer_app_tryCatch {
	private Integer numQuarto;
	private LocalDate checkIn, checkOut;
	
	public Z_exer_classReserva_tryCatch(int numQuarto, LocalDate checkIn, LocalDate checkOut) {
		this.numQuarto = numQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Integer duracao() {
		return Period.between(checkIn, checkOut).getDays();
	}
	
	public static Integer duracao(LocalDate d1, LocalDate d2) {
		return Period.between(d1, d2).getDays();
	}
	
	public void atualizarDatas(LocalDate novoCheckIn, LocalDate novoCheckOut) throws Z_exer_classDataInvalida {
		try {
			if (duracao(novoCheckIn, LocalDate.now()) > 0) {
				throw new Z_exer_classDataInvalida(" ***A nova data de check-in é inválida: A data deve ser maior que a data atual");
			} else if (duracao(novoCheckIn, novoCheckOut) < 0){
				throw new Z_exer_classDataInvalida(" ***As novas data são inválidas: A data de check-in deve ser maior que a data de check-out");
			} else {
				this.checkIn = novoCheckIn;
				this.checkOut = novoCheckOut;
				System.out.println(" ***Datas atualizadas com sucesso!");
				System.out.println(this);
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
		
		return texto.toString();
	}
}
