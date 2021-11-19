package ExerciciosJava;

import java.util.Scanner;

public class Lista2Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor1, valor2, valor3 = 0;

		Scanner read = new Scanner(System.in);

		System.out.println("Informe três números inteiros, e será exibido o maior entre eles. ");
		System.out.print("1º : ");
		valor1 = read.nextInt();

		System.out.print("2º : ");
		valor2 = read.nextInt();

		System.out.print("3º : ");
		valor3 = read.nextInt();

		if (valor1>valor2 && valor1>valor3) {
			System.out.println("O maior valor é " + valor1);
		} else if (valor2>valor3 && valor2>valor1) {
			System.out.println("O maior valor é " + valor2);
		} else if (valor3>valor1 && valor3>valor2) {
			System.out.println("O maior valor é " + valor3);
		}
	}
}
