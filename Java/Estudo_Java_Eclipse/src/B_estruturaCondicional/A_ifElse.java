package B_estruturaCondicional;

import java.time.LocalTime;

public class A_ifElse {

		public static void main(String[] args) {
			int hora_atual = LocalTime.now().getHour();
			
			if (hora_atual >= 6 && hora_atual <= 12) {
				System.out.printf("Bom dia! Agora são: %d hora(s)", hora_atual);
			} 
			else if (hora_atual > 12 && hora_atual < 18) {
				System.out.printf("Boa tarde! Agora são: %d hora(s)", hora_atual);
			} 
			else {
				System.out.printf("Boa noite! Agora são: %d hora(s)", hora_atual);
			}
		}
}