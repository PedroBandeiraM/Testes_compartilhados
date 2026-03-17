package e_heranca;

// Citar @Override e super() ou super.método()

public class A_app_heranca {
	
	public static void main(String[] args) {
		A_classAnimal_heranca rato = new A_classAnimal_heranca("Ratito", false, false);
		
		rato.comer();
		rato.dormir();
		
		System.out.println();
		A_classAnimal_heranca cobra = new A_classAnimal_heranca("Zzzzzzzz", true, true);
		
		cobra.comer();
		cobra.dormir();
		
		System.out.println();
		A_classUrso_heranca ursoPolar = new A_classUrso_heranca("Jeremias", true, true, "polar");
		
		ursoPolar.comer();
		ursoPolar.dormir();
	}
}
