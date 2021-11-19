package ExerciciosJava;

import java.util.Scanner;

public class Lista3Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 0, idade = 0, pessoas21 = 0, pessoas50 = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Quando quiser parar digite '99'. \n");
		while (idade <= 98) {
			System.out.println("Informe sua idade: ");
			idade = leia.nextInt();

			
				if (idade < 21) {
					pessoas21 += 1;
				} else if (idade > 50) {
					pessoas50 += 1;
				}
				
		}

		System.out.println("\nTotal de pessoas com menos de 21 anos: " + pessoas21);
		System.out.println("Total de pessoas entre 21 anos e 50 anos: " + pessoas50);
	}

}
