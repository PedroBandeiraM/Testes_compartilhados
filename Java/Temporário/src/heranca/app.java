package heranca;

public class app {

	public static void main(String[] args) {
		Animal gato = new Animal("Gatin", true);		
		System.out.println("O " + gato.getNome() + " foi criado.");
		
		Cachorro cachorro = new Cachorro("Chetão", true, "Shih-tzu");
		System.out.println("O " + cachorro.getNome() + " foi criado. \n");
		
		gato.fazerSom();
		cachorro.fazerSom();
		
		System.out.println();
		
		cachorro.brincar();
		gato.dormir();
	}
}
