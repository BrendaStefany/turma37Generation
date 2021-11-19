package entities;

public class Pessoa {

	
	// ATRIBUTOS: O QUE O OBJETO É, TEM, OU ESTAR)
//	public String nome; //ATRIBUTO
//	public int anoNascimento;
//	public boolean viva;
//	public String email;
//	public char pronome;
//	
	


	    //atributos o que o objeto é, tem, ou estar)
	    public String nome;
	    public int anoNascimento;
	    public boolean viva;
	    public String email;
	    public char pronome;

	    //construtor

	    //encapsulamento - getters and setters


	    //metodo
	    public int calcularIdade() {
	        return 2021 - anoNascimento;
	    }

	    public int calcularIdade(int ano) {
	        return ano - anoNascimento;
	    }

	   
	    public String toString() {
	        return "Pessoa [nome=" + nome + "]" ;
	      //  + anoNascimento= + " + anoNascimento 
	    }

	}
	
	
	
