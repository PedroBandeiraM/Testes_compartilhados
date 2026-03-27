package e_tratamentoErros;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Z_exer_app_tryCatch {
	public static DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) throws Z_exer_classDataInvalida { // Precisa de throws, pois a excessão não é tratada aqui, mas sim no método da outra classe (Reserva)
		LocalDate checkIn, checkOut;
		int numQuarto;
		
		System.out.print("Digite o número do quarto: ");
		numQuarto = leitor.nextInt();
		leitor.nextLine();
		
		System.out.print("Digite a data de check-in (dd/mm/yyyy): ");
		checkIn = LocalDate.parse(leitor.nextLine(), formatador);
		System.out.print("Digite a data de check-out (dd/mm/yyyy): ");
		checkOut = LocalDate.parse(leitor.nextLine(), formatador);		
		
		Z_exer_classReserva_tryCatch reserva = new Z_exer_classReserva_tryCatch(numQuarto, checkIn,  checkOut);
		System.out.println(reserva);

		System.out.println("\nDigite os dados para atualizar sua reserva: ");
		System.out.print("Digite a data de check-in (dd/mm/yyyy): ");
		checkIn = LocalDate.parse(leitor.nextLine(), formatador);
		System.out.print("Digite a data de check-out (dd/mm/yyyy): ");
		checkOut = LocalDate.parse(leitor.nextLine(), formatador);		
		
		reserva.atualizarDatas(checkIn, checkOut);
		System.out.println(reserva);
	}
}
