package TesteHerancaEntities;

public class Cachorro extends Animal{
	
	//atributos
	private String cor;
	private String raca;

	//CONSTRUTOR
	public Cachorro(String nome, int idade, String cor, String raca) {
		super(nome, idade);
		this.cor = cor;
		this.raca= raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	//METODOS
	

	
	
}
