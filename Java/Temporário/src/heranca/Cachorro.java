package heranca;

public class Cachorro extends Animal {
	private String raca;
	
	public String getRaca() {
		return raca;
	}
	
	public Cachorro(String nome, boolean sono, String raca) {
		super(nome, sono);
		this.raca = raca;
	}
	
	@Override
	public void fazerSom() {
		System.out.println("O " + nome + " latiu fervorosamente!");
	}
	
	public void brincar() {
		System.out.println("O " + nome + " brincou e está cansado!");
		dormir();
	}
}
