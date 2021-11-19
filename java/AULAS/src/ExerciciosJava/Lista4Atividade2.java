package ExerciciosJava;

import java.util.Scanner;

public class Lista4Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int[][] matriz = new int[3][3];
		int soma = 0,soma2 = 0;
		
		for (int linha=0;linha<3;linha++) {
			for (int coluna=0;coluna<3;coluna++) {
				System.out.println("Digite um número: ");
				matriz[linha][coluna] = leia.nextInt();
				soma += matriz[linha][coluna];
			}
		}
		System.out.println();
		for (int linha=0;linha<3;linha++) {
			for (int coluna=0;coluna<3;coluna++) {
				System.out.print(matriz[linha][coluna]+" ");
				
			}
			System.out.println();
		}
		
		soma2 = matriz[0][0] + matriz[1][1] + matriz[2][2];
		System.out.println("\nA soma dos valores da matriz é: " + soma);
		System.out.println("A soma dos valores na diagonal principal é: " + soma2);
	}

}
