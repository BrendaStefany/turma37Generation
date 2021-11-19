package ExerciciosJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista2Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe um número positivo ");
		numero = leia.nextInt();
		
		if (numero>0) {
			if ((numero%2)==0) {
			System.out.printf("O número é par. E sua raiz quadrada é %.2f " , Math.sqrt(numero) );	
				
			} else {
				numero = numero*numero;
				System.out.printf("O número é par. E sua raiz quadrada é " + decimal.format(numero) );	
			}
			
		}
		
	}

}
