package ExerciciosJava;

import java.util.Scanner;

public class Lista2AtividadeJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int valor1,valor2,valor3 = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe tr�s n�meros e eles ir�o ficar em ordem crescente. ");
		System.out.print("1�: ");
		valor1 = leia.nextInt();
		System.out.print("2�: ");
		valor2 = leia.nextInt();
		System.out.print("3�: ");
		valor3 = leia.nextInt();

		if (valor1>=valor2 && valor1>=valor3 && valor2>=valor3) {
			System.out.println(valor3 + " " + valor2 + " " + valor1);
		} else if (valor1>=valor2 && valor1>=valor3 && valor2<=valor3) {
			System.out.println(valor2 + " " + valor3 + " " + valor1); 
		} else if (valor1>=valor2 && valor1<=valor3 && valor2<=valor3) {
			System.out.println(valor2 + " " + valor1 + " " + valor3);
		} else if (valor1<=valor2 && valor1>=valor3 && valor2>=valor3) {
			System.out.println(valor3 + " " + valor1 + " " + valor2);
		} else if (valor1<=valor2 && valor1<=valor3 && valor2<=valor3) {
			System.out.println(valor1 + " " + valor2 + " " + valor3);
	    } else if (valor1<=valor2 && valor1<=valor3 && valor2>=valor3) {
	    	System.out.println(valor1 + " " + valor3 + " " + valor2);
	    } 

	}

}
