package ExerciciosJava;

import java.util.Scanner;

public class Lista3Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
//		final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
//		0(zero).(DO...WHILE)

		int numero = 0, cont = 0;
		double soma = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("Quando quiser parar digite '0'.");
		do {

			System.out.println("Informe um n�mero: ");
			numero = leia.nextInt();

			if (numero % 3 == 0 && numero > 0) {
				soma += numero;
				cont++;
			}

		} while (numero != 0);

		System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: " + (soma / cont));

	}
}
