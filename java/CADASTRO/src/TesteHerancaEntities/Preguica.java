package TesteHerancaEntities;

public class Preguica extends Animal {

	private double tamanho;
	private double peso;
	
	//CONSTRUTOR
	public Preguica(String nome, int idade, double tamanho, double peso) {
		super(nome, idade);
		this.tamanho = tamanho;
		this.peso = peso;
	}

	
	//ENCAPSULAMENTO
	
	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
