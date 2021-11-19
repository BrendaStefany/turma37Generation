package ExerciciosJava;

import java.util.Scanner;

public class Lista3Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0, soma = 0;

		Scanner leia = new Scanner (System.in);
		
	do {
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		soma += numero;
		
	}while (numero!=0);
		
		System.out.println("A soma dos números é: " + soma);
	}

}
