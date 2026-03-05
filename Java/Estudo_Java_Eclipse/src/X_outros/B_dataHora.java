package X_outros;

import java.util.Scanner;
import java.time.LocalDate; // DATA
import java.time.LocalDateTime; // DATA E HORÁRIO
import java.time.Instant; // DATA, HORÁRIO E FUSO
import java.time.LocalTime; // HORÁRIO
import java.time.format.DateTimeFormatter; // FORMATADOR DE TEMPO


public class B_dataHora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("DATAS DE AGORA: \n"); // ---------------------------------------------
		
		LocalDate data = LocalDate.now();
		LocalTime tempo = LocalTime.now();
		LocalDateTime dataTempo = LocalDateTime.now();
		Instant dataTempoFuso = Instant.now();

		System.out.println("- Data (LocalDate): " + data);
		System.out.println("- Tempo (LocalTime): " + tempo);
		System.out.println("- Data e tempo (LocalDateTime): " + dataTempo);
		System.out.println("- Data, tempo e fuso (Instant): " + dataTempoFuso);

		System.out.println("\nDATA PERSONALIZADA: \n"); // ---------------------------------------
		
		System.out.print("- Digite um tempo no formato (dd/mm/yyyy): ");
		LocalDate tempoPersonalizado = LocalDate.parse(leitor.nextLine(), formatador); // Utiliza o formatador setado para ler de forma personalizada
		
		System.out.println("\nString em tempo (LocalDate.parse()): " + tempoPersonalizado);
		System.out.println("  -> Ano: " + tempoPersonalizado.getYear());
		System.out.println("  -> Mês: " + tempoPersonalizado.getMonthValue() + " (" + tempoPersonalizado.getMonth() + ")");
		System.out.println("  -> Dia: " + tempoPersonalizado.getDayOfMonth() +" (" + tempoPersonalizado.getDayOfWeek() + ")");
		
		System.out.println("\nModificando o tempo (.plus e .minus): ");
		System.out.println("  -> 10 dias a mais: " + tempoPersonalizado.plusDays(10));
		System.out.println("  -> 3 mês a menos: " + tempoPersonalizado.minusMonths(3));
		System.out.println("  -> 5 anos a mais: " + tempoPersonalizado.plusYears(5));
		System.out.println("  -> 1 semana a mais: " + tempoPersonalizado.plusWeeks(1));
		
		System.out.println("\nDATA PERSONALIZADA 2: "); // -------------------------------------
		System.out.print(" - Digite o dia: ");
		int dia = leitor.nextInt();
		leitor.nextLine();
		System.out.print(" - Digite o mês");
		int mes = leitor.nextInt();
		leitor.nextLine();
		System.out.print(" - Digite o ano: ");
		int ano = leitor.nextInt();
		leitor.nextLine();
		
		LocalDate tempoPersonalizado2 = LocalDate.of(ano, mes, dia);
		System.out.println("\n  -> Tempo personalizado e dividido: " + tempoPersonalizado2);
		
		//		System.out.println(": " + );
		
		leitor.close();
	}

}
