package ExerciciosJava;

import java.util.Scanner;

public class Lista2AtividadeJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int valor1,valor2,valor3 = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe três números e eles irão ficar em ordem crescente. ");
		System.out.print("1º: ");
		valor1 = leia.nextInt();
		System.out.print("2º: ");
		valor2 = leia.nextInt();
		System.out.print("3º: ");
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
