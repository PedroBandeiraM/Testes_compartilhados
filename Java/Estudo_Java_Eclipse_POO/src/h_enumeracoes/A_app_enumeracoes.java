package h_enumeracoes;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class A_app_enumeracoes {

	public static void main(String[] args) throws InterruptedException {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Deseja comprar um tijolo [s/n]? ");
		char resp = leitor.next().toUpperCase().trim().charAt(0);
	
		if (resp == 'S') {
			System.out.println("- Confira o STATUS da entrega do seu tijolo: \n");
			
			System.out.println(A_enum_enumeracoes.PREPARANDO);
			A_app_enumeracoes.pausa();
			System.out.println(A_enum_enumeracoes.TRANSPORTANDO);
			A_app_enumeracoes.pausa();
			System.out.println(A_enum_enumeracoes.ENTREGUE);
			
			System.out.println("\n- Obrigado por comprar conosco!");
		} else if (resp == 'N') {
			System.out.println("Ok");
		}
		
		leitor.close();
	}
	
	public static void pausa() throws InterruptedException {
		System.out.print("Atualizando");
		for (int i = 0; i < 3; i++) {
			TimeUnit.SECONDS.sleep(1);
			System.out.print(".");
		}
		System.out.println("\n");
		
	}
}