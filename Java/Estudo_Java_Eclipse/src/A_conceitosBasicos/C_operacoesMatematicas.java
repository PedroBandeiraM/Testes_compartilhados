package A_conceitosBasicos;

public class C_operacoesMatematicas {
	public static void main(String[] args) {
		int num_1 = -1;
		int num_2 = 10;
		int num_3 = 25;
		int num_4 = 2;
		
		System.out.printf("Números: %n%n");
		System.out.printf("Número 1: %d %nNúmero 2: %d %nNúmero 3: %d %nNúmero 4: %d %n%n", num_1, num_2, num_3, num_4);
		
		int soma = num_2 + num_3;
		int sub = num_3 - num_2;
		int mult = num_2 * num_3;
		double divi = (double) num_4 / num_2;
		double expo = Math.pow(num_2, num_4);
		double radi = Math.sqrt(num_3);
		int abso = Math.abs(num_1);
		
		System.out.printf("Operações: %n%n");
		System.out.printf("Soma: %d %nSubtração: %d %nMultiplicação: %d %nDivisão: %.2f %nExponenciação: %.2f %nRadiciação: %.2f %nMódulo (absoluto): %d %n", soma, sub, mult, divi, expo, radi, abso);

	}
	
}
