package TesteHerancaEntities;

public class Animal {
	
	
	//atributos
	private String nome;
	private int idade;
	
	//CONSTRUTOR
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	
	//ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	//METODOS
	
	public String somCachorro() {
	return "O CACHORRO LATE E CORRE.";
	
}

	public String somCavalo() {
	return "O CAVALO CORRE E RELINCHA.";
	
}

	public String somPreguica() {
		return "A PREGUIÇA EMITE SOM E SOBE EM ÁRVORES.";
		
	}

	
	
	

	
	

	
	

}
