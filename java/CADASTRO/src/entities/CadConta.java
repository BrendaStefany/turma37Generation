package entities;

import java.util.Scanner;

import entities.conta;


public class CadConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o numero da conta : ");
		int auxConta = leia.nextInt();
		System.out.println("Digite o cpf da conta : ");
		String auxCpf = leia.next();
		conta cc1 = new conta(auxConta,auxCpf);



		System.out.println("Cliente "+cc1.getCpf()+" numero da sua conta : "+cc1.getNumero());
		System.out.println("Ativa a conta sim ou n�o S/N? ");
		char op = leia.next().toUpperCase().charAt(0);
		if (op=='S') {
			cc1.ativarConta();
		} 

		System.out.println("Saldo atual R$ "+cc1.getSaldo());
		System.out.println("Registrando 5 movimentos");

		for (int x =1 ; x<=5 ; x++) {
			System.out.println("Lan�amento "+x);
			System.out.print("Digite o valor R$ ");
			double auxValor = leia.nextDouble();
			System.out.print("D-debito ou C-credito :");
			op = leia.next().toUpperCase().charAt(0);
			if (op =='C' && cc1.isAtiva()) {
				cc1.credito(auxValor);
			} else if (op =='D' && cc1.isAtiva()) {
				cc1.debito(auxValor);
			}
		}
		System.out.println("Saldo Atual R$ "+cc1.getSaldo());
		
	}

}
