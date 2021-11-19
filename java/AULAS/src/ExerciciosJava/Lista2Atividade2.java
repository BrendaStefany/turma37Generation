package ExerciciosJava;

import java.util.Scanner;

public class Lista2Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		
		if (idade>=10 && idade<=14) {
			System.out.println("Categoria Infantil.");
		} else if (idade>=15 && idade<=17) {
			System.out.println("Categporia Juvenil");
		} else if (idade>=18 && idade<=25) {
			System.out.println("Categoria Adulto");
		} else {
			System.out.println("Não tem categoria para essa idade.");
		}

	}

}
