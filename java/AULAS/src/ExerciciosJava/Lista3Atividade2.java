package ExerciciosJava;

import java.util.Scanner;

public class Lista3Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int par = 0, impar = 0, numero;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe 10 n�meros");

		for (int cont = 1; cont <= 10; cont++) {
			System.out.print(cont + "� :");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				par += 1;
			} else {
				impar += 1;
			}
		}

		System.out.println("N�meros pares: " + par);
		System.out.println("N�meros �mpares: " + impar);

	}

}
