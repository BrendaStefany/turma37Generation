package ExerciciosJava;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		String codigoProduto[] = { "G-1", "G-2", "G-3", "G-4", "G-5", "G-6", "G-7", "G-8", "G-9", "G-10" };
		String nomeProduto[] = { "Teclado        ", "Monitor        ", "TV        ", "Gabinete Gamer", "Headphone",
				"Impressora", "Fonte        ", "Memoria RAM", "SSD        ", "Mouse      " };
		int estoque[] = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
		double valorProduto[] = { 100.50, 50.75, 70.99, 100.50, 50.75, 70.99, 100.50, 50.75, 70.99, 40 };
		String auxCodigo;
		int y = 0;
		int teste = 0, auxQtde = 0;
		char continuar;
		int[] quantidade = new int[10];
		double pagar=0;
		double somaTotal=0;

		// MOSTRANDO NA TELA
		System.out.println("LOJA DA TURMA 37");
		System.out.println("WAKANDO STORE");
		System.out.println("\\n♥ WAKANDA FOREVER ♥");
		System.out.println();
		System.out.println("RELATÓRIO DOS PRODUTOS");
		System.out.println("COD\tPRODUTO\t      ESTOQUE\tVALOR(R$)");

		for (int x = 0; x < nomeProduto.length; x++) {
			System.out.printf("%s\t%s\t %d\t %.2f\n", codigoProduto[x], nomeProduto[x], estoque[x], valorProduto[x]
					);
			// System.out.println(codigoProduto[x]+"\t"+nomeProduto[x]+"\t"+estoque[x]+"\t"+valorProduto[x]);

		}

		System.out.println();
		System.out.println("Digite o código do produto que deseja comprar: ");
		auxCodigo = leia.next().toUpperCase();

		System.out.println("PRODUTO ESCOLHIDO");
		System.out.println("COD\tPRODUTO\t      ESTOQUE\t VALOR");

		for (y = 0; y < nomeProduto.length; y++) {
			if (codigoProduto[y].equals(auxCodigo)) {
				System.out.printf("%s\t%s\t %d\t %.2f\n", codigoProduto[y], nomeProduto[y], estoque[y],
						valorProduto[y]);
				// System.out.println(codigoProduto[x]+"\t"+nomeProduto[x]+"\t"+estoque[x]+"\t"+valorProduto[x]);
				break;
			} else {
				teste++;
			}
		}

		if (teste == nomeProduto.length) {
			System.out.println("Produto não encontrado");
		} else {
			System.out.println("Quantos vc deseja comprar?");
			auxQtde = leia.nextInt();
			if (auxQtde < 0) {
				System.out.println("Quantidade informada não disponivel.");
			} else if (estoque[teste] == 0) {
				System.out.println("Produto indisponivel");
			} else if (auxQtde > estoque[teste]) {
				System.out.println("Quantidade indisponivel");
			} else {
				pagar=auxQtde * valorProduto[teste];
				estoque[teste] -= auxQtde;
			}
			if (auxQtde>=0 && auxQtde<=20) {
			quantidade[y] += auxQtde;
			}
		}
		
		System.out.println("\nCARRINHO DE COMPRAS");
		System.out.println("COD\tPRODUTO\t     ESTOQUE\tVALOR\tQUANTIDADE");
		for (int x = 0; x < 10; x++) {
			if (estoque[x] < 20) {
				System.out.printf("%s\t%s\t%d\t%.2f\t    %d\n", codigoProduto[x], nomeProduto[x], estoque[x], valorProduto[x],quantidade[x]);
			}
		}
		somaTotal+=pagar;
		System.out.println("Total a pagar R$: " + somaTotal);
		System.out.println("\nDeseja continuar comprando? (S/N)");
		continuar = leia.next().toUpperCase().charAt(0);

		while (continuar == 'S') {

			System.out.println("PÓS VENDA");
			System.out.println("COD\tPRODUTO\t    ESTOQUE\tVALOR");
			for (int x = 0; x < nomeProduto.length; x++) {
				System.out.printf("%s\t%s\t %d\t %.2f\n", codigoProduto[x], nomeProduto[x], estoque[x],
						valorProduto[x]);
				// System.out.println(codigoProduto[x]+"\t"+nomeProduto[x]+"\t"+estoque[x]+"\t"+valorProduto[x]);

			}
			
			System.out.println();
			System.out.println("Digite o código do produto que deseja comprar: ");
			auxCodigo = leia.next().toUpperCase();
			
			
			System.out.println("PRODUTO ESCOLHIDO");
			System.out.println("COD\tPRODUTO\t      ESTOQUE\t VALOR");
			
			
			teste=0;
			for (y = 0; y < nomeProduto.length; y++) {
				if (codigoProduto[y].equals(auxCodigo)) {
					System.out.printf("%s\t%s\t  %d\t %.2f\n", codigoProduto[y], nomeProduto[y], estoque[y],
							valorProduto[y]);
					// System.out.println(codigoProduto[x]+"\t"+nomeProduto[x]+"\t"+estoque[x]+"\t"+valorProduto[x]);
					break;
				} else {
					teste++;
				}
			}

			if (teste == nomeProduto.length) {
				System.out.println("Produto não encontrado");
			} else {
				System.out.println("Quantos vc deseja comprar?");
				auxQtde = leia.nextInt();
				if (auxQtde < 0) {
					System.out.println("Quantidade informada não disponivel.");
				} else if (estoque[teste] == 0) {
					System.out.println("Produto indisponivel");
				} else if (auxQtde > estoque[teste]) {
					System.out.println("Quantidade indisponivel");
				} else {
					pagar=auxQtde * valorProduto[teste];
					
					estoque[teste] -= auxQtde;
				}
				if (auxQtde>=0 && auxQtde<=20) {
				quantidade[y] += auxQtde;
				}
			}
			
			System.out.println("\nCARRINHO DE COMPRAS");
			System.out.println("COD\tPRODUTO\t     ESTOQUE\tVALOR\tQUANTIDADE");
			for (int x = 0; x < 10; x++) {
				if (estoque[x] < 20) {
//					if (auxCodigo==codigoProduto[x]) {
//						quantidade[x]+=auxQtde;
//					}
					System.out.printf("%s\t%s\t%d\t%.2f\t    %d\n", codigoProduto[x], nomeProduto[x], estoque[x], valorProduto[x],quantidade[x]);
				}
			}
			somaTotal+=pagar;
			System.out.println("Total a pagar R$: " + somaTotal);
			System.out.println("Deseja continuar comprando? (S/N)");
			continuar = leia.next().toUpperCase().charAt(0);

		} 
		
		System.out.println("Obrigada, Volte sempre!");

	}

}
