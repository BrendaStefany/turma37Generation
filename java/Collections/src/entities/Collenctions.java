package entities;

import java.util.ArrayList;
import java.util.Collection;

public class Collenctions {
	public static void main(String[] args) {
		
		String produtos[] = {"Teclado", "Monitor","TV", "Gabinete Gamer", "Headphone", 
				"Impressora", "Fonte", "Memória RAM", "SSD" };
				
		Collection<Alunos> dezProdutos  = new ArrayList<>();
		
		for (int x=0;x<produtos.length;x++) {
			dezProdutos.add(new String("COD-"+(x+1),produtos[x]));
		}
		
		
		
		
	}

}