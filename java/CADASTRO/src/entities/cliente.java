package entities;

public class cliente {


	    //atributos o que o objeto é, tem, ou estar)
	    public String nome;
	    public int anoNascimento;
	    public boolean viva;
	    public String email;
	    public char pronome;
	    public String cidade;

	    //construtor

	    //encapsulamento - getters and setters


	    //metodo
	    public int calcularIdade() {
	        return 2021 - anoNascimento;
	    }

	    
	    
	   
	    public String toString() {
	        return "Cliente [nome=" + nome + " ,Idade=" + anoNascimento + " ,viva=" + viva + " ,cidade=" + cidade + " ,e-mail=" + email + "]" ;
	      //  + anoNascimento= + " + anoNascimento 
	    }

	}