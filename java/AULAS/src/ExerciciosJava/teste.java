package ExerciciosJava;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int item, item1 = 0, item2 = 0, item3 = 0;
		double desconto1 = 0;
		

		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("Escolha qual item deseja comprar:");
			System.out.println();
			System.out.println("1 - HeadPhone - R$ 450,00");
			System.out.println("2 -  Teclado  - R$ 380,00");
			System.out.println("3 -   Mouse  -  R$ 280,00");

			System.out.println("Digite 0 quando desejar parar.");
			item = ler.nextInt();
			System.out.println();

			if (item == 1) {
				item1 = item1 + 1;
			} else if (item == 2) {
				item2 = item2 + 1;
			} else if (item == 3) {
				item3 = item3 + 1;
			}

		} while (item != 0); //enquanto esta condição for verdadeira, ele ocntinua repetindo, e quando for diferente, ele sai do laço

		if (item1 > 0) {
			
			if (item1 > 10) {
				desconto1 = (item1 * 450) * 0.1;
				System.out.println(
						"Você comprou " + item1 + " HeadPhones e pagará um total de R$" + ((item1 * 450) - desconto1));
			}

			if (item1 < 10) {
				if (item1 <= 2) {
					System.out.println("Você comprou " + item1 + " HeadPhones e pagará um total de R$" + item1 * 450);
				} else if (item1 < 4) {
					desconto1 = (item1 * 450) * 0.05;
					System.out.println("Você comprou " + item1 + " HeadPhones e pagará um total de R$"
							+ ((item1 * 450) - desconto1));
				} else if (item1 < 13) {
					desconto1 = (item1 * 450) * 0.07;
					System.out.println("Você comprou " + item1 + " HeadPhones e pagará um total de R$"
							+ ((item1 * 450) - desconto1));
				} else if (item1 < 24) {
					desconto1 = (item1 * 450) * 0.1;
					System.out.println("Você comprou " + item1 + " HeadPhones e pagará um total de R$"
							+ ((item1 * 450) - desconto1));
				}
			}
			
		}

		if (item2 > 0) {
			if (item2 < 10) {
				if (item2 <= 2) {
					System.out.println("Você comprou " + item2 + " Teclados e pagará um total de R$" + item2 * 380);
				} else if (item2 < 4) {
					desconto1 = (item2 * 380) * 0.05;
					System.out.println(
 							"Você comprou " + item2 + " Teclados e pagará um total de R$" + ((item2 * 380) - desconto1));
				} else if (item2 < 15) {
					desconto1 = (item2 * 380) * 0.07;
					System.out.println(
							"Você comprou " + item2 + " Teclados e pagará um total de R$" + ((item2 * 380) - desconto1));
				} else if (item2 < 28) {
					desconto1 = (item2 * 380) * 0.1;
					System.out.println(
							"Você comprou " + item2 + "Teclados e pagará um total de R$" + ((item2 * 380) - desconto1));
				}
			}
			if (item2 > 10) {
				desconto1 = (item2 * 380) * 0.1;
				System.out.println(
						"Você comprou " + item2 + " Teclados e pagará um total de R$" + ((item2 * 380) - desconto1));
			}

		}

		if (item3 > 0) {
			if (item3 < 10) {
				if (item3 <= 2) {
					System.out.println("Você comprou " + item3 + " Mouses e pagará um total de R$" + item3 * 280);
				} else if (item3 < 4) {
					desconto1 = (item3 * 280) * 0.05;
					System.out.println(
							"Você comprou " + item3 + " Mouses e pagará um total de R$" + ((item3 * 280) - desconto1));
				} else if (item3 < 19) {
					desconto1 = (item3 * 280) * 0.07;
					System.out.println(
							"Você comprou " + item3 + " Mouses e pagará um total de R$" + ((item3 * 280) - desconto1));
				} else if (item3 < 37) {
					desconto1 = (item3 * 280) * 0.1;
					System.out.println(
							"Você comprou " + item3 + " Mouses e pagará um total de R$" + ((item3 * 280) - desconto1));
				}
			}
			if (item3 > 10) {
				desconto1 = (item3 * 280) * 0.1;
				System.out.println(
						"Você comprou " + item3 + " Mouses e pagará um total de R$" + ((item3 * 280) - desconto1));
			}

		}

	}
}
