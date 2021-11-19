package ExerciciosJava;

import java.util.Scanner;

public class ExercicioAuxilioEmergencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome, respostaChefe,outroAuxilio; 
		char pronome = 0;
		int filhos, auxilioFinal;
		final int valorAuxilio = 600;
		
		Scanner read = new Scanner (System.in);
		
		
		System.out.println("Informe o seu nome: ");
		nome = read.next();
		
		System.out.println("Voc� se considera chefe/a de fam�lia? (S/N)");
		respostaChefe = read.next().toUpperCase();
		
		System.out.println("Como voc� se define A/E/O? ");
		pronome = read.next().charAt(0);
		
		System.out.println("Quantos filhos vc tem? ");
		filhos = read.nextInt();
		
		System.out.println("Voc� recebeu outro auxilio? ");
		outroAuxilio = read.next().toUpperCase();
		
		if (pronome=='A') {
			System.out.println("====== Seja Bem-Vinda ======");
		} else if (pronome=='O') {
			System.out.println("====== Seja Bem-Vindo ======");
		} else if (pronome=='E') {
			System.out.println("====== Seja Bem-Vinde ======");
		}
		
		if ((respostaChefe.equals("S")) && (outroAuxilio.equals("N"))) {
			auxilioFinal = (valorAuxilio * 2)+ (filhos*50);
			System.out.println("Voc� ir� receber R$" + auxilioFinal + "de Aux�lio Emergencial.");
		} else if ((respostaChefe.equals("S")) && (outroAuxilio.equals("S"))) {
			System.out.println("Voc� n�o tem direito de receber o Aux�lio Emergencial.");
		} else if ((respostaChefe.equals("N")) && (outroAuxilio.equals("N"))) {
			System.out.println("Voc� ir� receber R$" + valorAuxilio + (filhos*50) + "de Aux�lio Emergencial.");
		} else if ((respostaChefe.equals("N")) && (outroAuxilio.equals("S"))) {
			System.out.println("Voc� n�o tem direito de receber o Aux�lio Emergencial. ");
		}
	}

}
