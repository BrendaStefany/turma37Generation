package entities;

public class Produto {
	
	 public String codigo;
	    public String nome;
	    public int estoque=10;
	    public double valor;

	    public void tirarEstoque(int quantidade) {
	        estoque -= quantidade;
	    }
	    public void colocarEstoque(int quantidade) {
	        estoque += quantidade;
	    }
	    public String toString() {
	        return "Produto [codigo=" + codigo + ", nome=" + nome + ", estoque=" + estoque + ", valor=" + valor + "]";
	    }

	
//	    public String getInformacoesCliente() {
//	    	
//	         String informacoesCliente="Cliente [nome=" + nome + " ,Idade=" + anoNascimento + " ,viva=" + viva + " ,cidade=" + cidade + " ,e-mail=" + email + "]" ;
//	         return informacoesCliente;
//	         
//	
//	    public cliente (String nome1, int anoNascimento1, boolean viva1, String email1, char pronome1,String cidade1) {
//	    	nome=nome1;
//	    	anoNascimento=anoNascimento1;
//	    	viva=viva1;
//	    	email=email1;
//	    	pronome=pronome1;
//	    	cidade=cidade1;
//	    }

	    
	
}
