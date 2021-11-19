package ExerciciosJava;
import java.util.Scanner;
public class Lista1Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		double custoFabrica;
		
		System.out.println("Informe o custo de fábrica do carro: R$");
		custoFabrica = read.nextDouble();
		
		custoFabrica = custoFabrica + (custoFabrica*0.28) + (custoFabrica*0.45);
		
		System.out.println("O custo final para o consumidor é: R$" + custoFabrica);
		
	}

}
