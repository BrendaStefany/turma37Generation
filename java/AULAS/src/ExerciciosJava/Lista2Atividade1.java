package ExerciciosJava;

import java.util.Scanner;

public class Lista2Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor1, valor2, valor3 = 0;

		Scanner read = new Scanner(System.in);

		System.out.println("Informe tr�s n�meros inteiros, e ser� exibido o maior entre eles. ");
		System.out.print("1� : ");
		valor1 = read.nextInt();

		System.out.print("2� : ");
		valor2 = read.nextInt();

		System.out.print("3� : ");
		valor3 = read.nextInt();

		if (valor1>valor2 && valor1>valor3) {
			System.out.println("O maior valor � " + valor1);
		} else if (valor2>valor3 && valor2>valor1) {
			System.out.println("O maior valor � " + valor2);
		} else if (valor3>valor1 && valor3>valor2) {
			System.out.println("O maior valor � " + valor3);
		}
	}
}
