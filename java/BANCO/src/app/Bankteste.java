package app;

import java.util.Scanner;

import entities.Poupanca;

public class Bankteste {

	public static void main(String[] args) {
		int numero, diaAniversarioConta, auxDia;
		String cpf;
		double valor;
		char op;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Informe o número: ");
		numero = leia.nextInt();
		System.out.print("Informe o cpf :");
		cpf = leia.next();
		System.out.print("Informe o dia de aniversário da conta: ");
		diaAniversarioConta=leia.nextInt();		
		
		Poupanca cp1 = new Poupanca(numero,cpf,diaAniversarioConta);
		
		for (int x=1;x<=10;x++) {
			System.out.println();
			System.out.println("Movimento nº "+x);
			System.out.println("Saldo: R$"+cp1.getSaldo());
			System.out.println("Digite o valor: ");
			valor = leia.nextDouble();
			System.out.println("D-débito ou C-crédito");
			op = leia.next().toUpperCase().charAt(0);
			if (op=='D') {
				cp1.debito(valor);
			} else if (op=='C') {
				cp1.credito(valor);
			} else {
				System.out.println("Opção inválida, movimento perdido.");
			}
		
			System.out.println("Deseja continuar? S/N");
			op = leia.next().toUpperCase().charAt(0);
			if (op=='N') {
				break;
			}
			
		}
	
		System.out.print("Saldo: R$"+ cp1.getSaldo());
		System.out.print("\nInforme o dia de hoje: ");
		auxDia=leia.nextInt();
		cp1.correcao(auxDia);
		System.out.println("Saldo corrigido: R$"+ cp1.getSaldo());
	}
}