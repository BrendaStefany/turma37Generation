package entities;

import java.util.Scanner;

public class CadCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		cliente cliente1 = new cliente();
		
		System.out.println("CADASTRO DE CLIENTES");
		cliente1.nome= "Brenda";
		cliente1.anoNascimento=1998;
		cliente1.email="brendaStefany@gmail.com";
		cliente1.cidade="Igarassu";
		cliente1.pronome='a';
		cliente1.viva=true;
		
		System.out.printf("Olá Sr%c. %s, Seja Bem Vind%c." , cliente1.pronome,cliente1.nome,cliente1.pronome);
		System.out.println();
		System.out.println(cliente1.toString());
		
	}

}
