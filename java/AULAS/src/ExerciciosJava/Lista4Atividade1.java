package ExerciciosJava;

import java.util.Scanner;

public class Lista4Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[5];
		int numeroMaior = 0;

		Scanner leia = new Scanner(System.in);

		for (int cont = 0; cont < 5; cont++) {

			System.out.println("Digite um número: ");
			numeros[cont] = leia.nextInt();
//			if (numeros[cont]>=numeroMaior) {
//				numeroMaior=numeros[cont];
//			}
			
			// TESTANDO FOR-EACH
			for (int numeroEntrada : numeros) {
				if (numeros[cont] >= numeroMaior) {
					numeroMaior = numeros[cont];
				}

			}

		}
		System.out.println("\nO maior número digitado foi: " + numeroMaior);
	}

}
