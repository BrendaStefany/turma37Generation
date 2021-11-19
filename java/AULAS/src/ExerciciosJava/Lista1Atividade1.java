package ExerciciosJava;
import java.util.Scanner;

public class Lista1Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner read = new Scanner(System.in);
		
		
		int data,mes,anoNasc,dataAtual,mesNasc,mesAtual,anoAtual,totalDias;

		   System.out.println("Informe sua data de nascimento: "); 
		   data = read.nextInt();
		   System.out.println("Informe seu mês de nascimento: "); 
		   mes = read.nextInt();
		   System.out.println("Informe seu ano de nascimento: "); 
		   anoNasc = read.nextInt();
		   System.out.println("Informe sua data atual: "); 
		   dataAtual = read.nextInt();
		   System.out.println("Informe seu mês atual: "); 
		   mesAtual = read.nextInt();
		   System.out.println("Informe seu ano atual: "); 
		   anoAtual = read.nextInt();
		

		   totalDias =(anoAtual-1) - anoNasc;
		   totalDias = totalDias *12;
		   totalDias = totalDias + (mesAtual-1);
		   totalDias = totalDias * 30;

		
		   System.out.println("\n A idade aproximadamente em dias é: " + totalDias); 
		   
	}

}
