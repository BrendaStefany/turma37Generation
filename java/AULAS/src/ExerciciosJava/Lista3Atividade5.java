package ExerciciosJava;

import java.util.Scanner;

public class Lista3Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Escrever um programa que receba vários números inteiros no teclado. E no
//		final imprimir a média dos números múltiplos de 3. Para sair digitar
//		0(zero).(DO...WHILE)

		int numero = 0, cont = 0;
		double soma = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("Quando quiser parar digite '0'.");
		do {

			System.out.println("Informe um número: ");
			numero = leia.nextInt();

			if (numero % 3 == 0 && numero > 0) {
				soma += numero;
				cont++;
			}

		} while (numero != 0);

		System.out.println("A média dos números múltiplos de 3 é: " + (soma / cont));

	}
}
